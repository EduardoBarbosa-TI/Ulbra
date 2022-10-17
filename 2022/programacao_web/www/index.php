<?php 
    if(!isset($_GET['controller'])){
        require_once('controllers/SiteController.php');
        $SiteController = new SiteController();
        $SiteController -> home();
    }else{
        switch ($_REQUEST['controller']) {
            case 'site':
                require_once('controllers/SiteController.php');
                $SiteController = new SiteController();
                if(!isset($_GET['action'])){
                    $SiteController -> home();
                }else{
                    switch ($_REQUEST['action']) {
                        case 'home':
                            $SiteController -> home();
                        break;
                        case 'about':
                            $SiteController -> about(); 
                        break;
                        case 'contact':
                            $SiteController -> contact(); 
                        break;
                    }
                }
            break;
            case 'client':
                require_once('controllers/ClientController.php');
                $ClientController = new ClientController();
                if(!isset($_GET['action'])){
                    $ClientController -> index();
                }else {
                    switch ($_REQUEST['action']) {
                        case 'register':
                            $ClientController -> register();
                        break;
                        
                    }
                }   
            break;
            case 'product':
                require_once('controllers/ProductsController.php');
                $products = new ProductsController();
                if(!isset($GET['action'])){
                    $products -> listProducts();
                }else{
                    switch ($_REQUEST['action']){
                        case 'listProducts':
                            $products -> listProducts();
                            break;
                    }
                }
            break; 
        }
    }   
?>

