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
</head>

<body>
    <header class="container-fluid bg-primary p-5">
        <h1 class="text-white">Login</h1>
    </header>

    <section class="container my-3">
        <div class="row">
            <div class="col-12 col-sm-12">
                <h3>Login do Sistema</h3>
            </div>
            <div class="col-12 col-sm-12">
                <form action="?controller=user&action=validationLogin" class="row g-3 needs-validation" method="POST">
                    <div class="col-md-12">
                        <label for="validationTooltip01" class="form-label">Login</label>
                        <input type="text" name="userName" class="form-control" id="validationTooltip01" required>
                    </div>
                    <div class="col-md-12">
                        <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
                        <div class="col-sm-12">
                            <input type="password" name="password" class="form-control" id="inputPassword" required>
                        </div>
                    </div>
                    <div class="col-12">
                        <button class="btn btn-primary" type="submit" href="?controller=user&action=login">Submit form</button>
                    </div>
                </form>
            </div>
        </div>
    </section>

</body>

</html>