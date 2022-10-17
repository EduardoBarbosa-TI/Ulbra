<?php
    
    class ClientController{

        public function index(){
        }
        
        public function register(){
            require_once('views/templates/header.php');
            require_once('views/templates/footer.php');
            if (isset($_POST['accept'])) {
                $accept = true;
                $acceptView = 'O termo foi aceito';
            } else {
                $accept = false;
                $acceptView = 'O termo não foi aceito';
            }

            $arrayClient = array(
                'name' => $_POST['name'],
                'email' => $_POST['email'],
                'cel' => $_POST['cel'],
                'gender' => $_POST['gender'],
                'accept' => $accept,
                'acceptView' => $acceptView
            );
        }
    }
?>
