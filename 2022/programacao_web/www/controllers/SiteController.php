<?php

class SiteController{

    public function home(){
        require_once('views/templates/header.php');
        require_once('views/site/home.php');
        require_once('views/templates/footer.php');
    }

    public function about(){
        require_once('views/templates/header.php');
        require_once('views/site/about.php');
        require_once('views/templates/footer.php');
    }

    public function contact(){
        require_once('views/templates/header.php');
        require_once('views/site/contact.php');
        require_once('views/templates/footer.php');
    }

}