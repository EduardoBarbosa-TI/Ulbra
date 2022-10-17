<?php
    class ContactsModel{

        public function registrationContacts(){
            require_once('db/ConetionClass.php');
            $connectClass = new ConetionClass();
            $connectClass->openConetion();
            $connection = $connectClass->getConn();

            $sql = "SELECT * FROM contacts
            
            "; 
    
            return $connection -> query($sql);
        }


        public function listContacts(){
            require_once('db/ConetionClass.php');
            $connectClass = new ConetionClass();
            $connectClass->openConetion();
            $connection = $connectClass->getConn();

            $sql = "SELECT * FROM contacts"; 
    
            return $connection -> query($sql);
        }
    }
?>