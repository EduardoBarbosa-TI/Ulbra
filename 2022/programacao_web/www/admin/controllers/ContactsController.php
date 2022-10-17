<?php  
    class ContactsController{
        
        public function registrationContacts(){
            require_once('models/ContactsModel.php');
            $contactsModel= new ContactsModel();
            $result = $contactsModel->registrationContacts();


            $arrayContacts =  array();

            while ($contact = $result -> fetch_assoc()) {
                array_push($arrayContacts, $contact);
            }

            require_once('views/templates/header.php');
            require_once('views/templates/offcanva.php');
            require_once('views/templates/home.php');
            require_once('views/contacts/registrationContacts.php');
            require_once('views/templates/footer.php');


        }


        public function listContacts(){
            require_once('models/ContactsModel.php');
            $contactsModel= new ContactsModel();
            $result = $contactsModel->listContacts();


            $arrayContacts =  array();

            while ($contact = $result -> fetch_assoc()) {
                array_push($arrayContacts, $contact);
            }

            require_once('views/templates/header.php');
            require_once('views/templates/offcanva.php');
            require_once('views/templates/home.php');
            require_once('views/contacts/listContacts.php');
            require_once('views/templates/footer.php');

        }
    }
?>