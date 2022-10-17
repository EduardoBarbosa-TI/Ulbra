<?php
    class UserModel{
        
        public function consultUser($userName){

            require_once('db/ConetionClass.php');
            $ConnectClass = new ConetionClass();
            $ConnectClass -> openConetion();
            $connection = $ConnectClass -> getConn();

            $sql = "
                SELECT * FROM users
                WHERE
                    user = '$userName'
            ";

            return $connection -> query($sql);
        }
    }
?>