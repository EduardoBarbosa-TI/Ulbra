<?php
   class ClientModel{  

      public function registrationClients(){ 
         require_once('db/ConetionClass.php');
         $connectClass = new ConetionClass();
         $connectClass->openConetion();
         $connection = $connectClass->getConn();

      
         $sql = "SELECT * FROM clients"; 
   
         return $connection -> query($sql);
      }


      public function consultClient($id){

         require_once('db/ConetionClass.php');
         $connectClass = new ConetionClass();
         $connectClass->openConetion();
         $connection = $connectClass->getConn();

      
         $sql = "SELECT * FROM clients WHERE idClient= $id"; 
   
         return $connection -> query($sql);
      }

      public function saveEditClient($id,$name,$email,$phone,$address){
         require_once('db/ConetionClass.php');
         $connectClass = new ConetionClass();
         $connectClass->openConetion();
         $connection = $connectClass->getConn();

         $sqlUpdate = "UPDATE clients SET name='$name',phone='$phone',email='$email',address='$address' WHERE idClient='$id'"; 

         return $connection -> query($sqlUpdate);
      }

      public function deleteClient($id){
         require_once('db/ConetionClass.php');
         $connectClass = new ConetionClass();
         $connectClass->openConetion();
         $connection = $connectClass->getConn();

      
         $sql = "DELETE FROM clients WHERE idClient= $id"; 
   
         return $connection -> query($sql);

      }
         
      public function listClients(){ 
         require_once('db/ConetionClass.php');
         $connectClass = new ConetionClass();
         $connectClass->openConetion();
         $connection = $connectClass->getConn();


         $sql = "SELECT * FROM clients"; 
   
         return $connection -> query($sql);
      }
   }
?>