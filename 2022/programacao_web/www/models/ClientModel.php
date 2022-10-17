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
         
   }
?>