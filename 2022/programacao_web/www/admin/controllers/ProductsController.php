<?php   
    class ProductsController{

        public function registrationProducts(){
            require_once('models/ProductsModel.php');
            $productModel= new ProductsModel();
            $result = $productModel->registrationProducts();

            $arrayProducts =  array();

            while ($product = $result -> fetch_assoc()) {
                array_push($arrayProducts, $product);
            }

            require_once('views/templates/header.php');
            require_once('views/templates/home.php');
            require_once('views/templates/offcanva.php');
            require_once('views/products/registrationProducts.php');
            require_once('views/templates/footer.php');

        }


        public function listProducts(){
            require_once('models/ProductsModel.php');
            $productModel= new ProductsModel();
            $result = $productModel->listProducts();

            $arrayProducts =  array();

            while ($product = $result -> fetch_assoc()) {
                array_push($arrayProducts, $product);
            }

            require_once('views/templates/header.php');
            require_once('views/templates/home.php');
            require_once('views/templates/offcanva.php');
            require_once('views/products/listProducts.php');
            require_once('views/templates/footer.php');

        }
    }
?>