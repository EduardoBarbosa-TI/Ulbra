<?php
    class ProductsModel{
        public function listProducts(){
            require_once('db/ConetionClass.php');
            $connectClass = new ConetionClass();
            $connectClass->openConetion();
            $connection = $connectClass->getConn();


            $sql = "SELECT * FROM products"; 
    
            return $connection -> query($sql);
        }
    } 
?>