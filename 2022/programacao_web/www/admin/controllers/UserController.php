<?php
    class UserController{
        
        public function validationLogin(){
            $userName = $_POST['userName'];
            $password = $_POST['password'];
            require_once('models/UserModel.php');
            $UserModel = new UserModel();

            $result = $UserModel -> consultUser($userName);

            if($line = $result->fetch_assoc()){
                if($password == $line['password']){
                    $_SESSION['user'] = $line;
                    header('Location: index.php');
                }else{
                    require_once('MainController.php');
                    $MainController = new MainController();
                    $MainController -> index();
                }
            }else{
                require_once('views/user/login.php');
                require_once('views/user/message.php');
                require_once('MainController.php');
                $MainController = new MainController();
                $MainController -> index();

            }
        }
    }
