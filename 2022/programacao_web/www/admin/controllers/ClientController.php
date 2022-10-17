<?php



class ClientController{
    public function registrationClients(){

        require_once('models/ClientModel.php');
        $clientModel = new ClientModel();
        $result = $clientModel->registrationClients();

        $arrayClients =  array();

        while ($client = $result->fetch_assoc()) {
            array_push($arrayClients, $client);
        }
        require_once('views/templates/header.php');
        require_once('views/templates/offcanva.php');
        require_once('views/templates/home.php');
        require_once('views/client/registrationClients.php');
        require_once('views/templates/footer.php');
    }

    public function editClient(){

        if (empty($_GET['id'])) {
            header('Location: ?controller=client&action=listClients');
        } else {
            $id = $_GET['id'];
            require_once('models/ClientModel.php');
            $clientModel = new ClientModel();
            $result = $clientModel->consultClient($id);

            $arrayClients =  array();

            $result = $clientModel->consultClient($id);

            $arrayClients =  array();





            if ($result->num_rows > 0) {

                while ($client = $result->fetch_assoc()) {
                    array_push($arrayClients, $client);
                    $nome = $client['name'];
                    $phone = $client['phone'];
                    $email = $client['email'];
                    $adreess = $client['address'];
                }


                require_once('views/templates/header.php');
                require_once('views/templates/offcanva.php');
                require_once('views/templates/home.php');
                require_once('views/client/editClient.php');
                require_once('views/templates/footer.php');
            } else {
                header('Location: ?controller=client&action=listClients');
            }
        }
    }

    public function saveEditClient(){
        if (isset($_POST['update'])) {
            $id = $_POST['idClient'];
            $name = $_POST['name'];
            $phone = $_POST['phone'];
            $email = $_POST['email'];
            $address = $_POST['address'];

            require_once('models/ClientModel.php');
            $clientModel = new ClientModel();
            $clientModel->saveEditClient($id, $name, $email, $phone, $address);
        }
        header('Location:?controller=client&action=listClients');
    }

    public function deleteClient() {
        if (empty($_GET['id'])) {
            header('Location: ?controller=client&action=listClients');
        } else {
            $id = $_GET['id'];
            require_once('models/ClientModel.php');
            $ClientModel = new ClientModel();
            $result = $ClientModel->consultClient($id);

            if ($result->num_rows > 0) {
                $ClientModel->deleteClient($id);
            }

            header('Location: ?controller=client&action=listClients');
        }
    }

    public function registerView(){

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
        require_once('views/templates/header.php');
        require_once('views/client/registerView.php');
        require_once('views/templates/footer.php');
    }

    public function listClients(){

        require_once('models/ClientModel.php');
        $clientModel = new ClientModel();
        $result = $clientModel->listClients();


        $arrayClients =  array();

        while ($client = $result->fetch_assoc()) {
            array_push($arrayClients, $client);
        }

        require_once('views/templates/header.php');
        require_once('views/templates/offcanva.php');
        require_once('views/templates/home.php');
        require_once('views/client/listClients.php');
        require_once('views/templates/footer.php');
    }
}
