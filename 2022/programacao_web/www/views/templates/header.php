<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Construtora LTDA</title>

    <!--Bootstrap-->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

    <!--CSS JS -->
    <link rel="stylesheet" href="assets/css/style.css">
    <script src="assets/js/script.js" defer></script>
</head>

<body>
    <header class="container-fluid bg-dark p-4">
        <nav class="navbar navbar-expand-sm navbar-dark" id="navbar">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Logo</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar" aria-controls="collapsibleNavbar" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end me-sm-5" id="collapsibleNavbar">
                    <ul class="navbar-nav mb-2 mb-lg-0 bg-dark">
                        <li class="nav-item">
                            <a class="nav-link" href="?controller=site&action=home">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="?controller=site&action=about">Sobre</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="?controller=site&action=contact">Contato</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <section class="container-fluid p-5">
        <div class="row">
            <div class="col-4 col-sm-4">
                <h2>Produtos</h2>
                <ul class="navbar-nav mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href="?controller=product&action=listProducts">Listar</a>
                    </li>
                </ul>
            </div>
            
        