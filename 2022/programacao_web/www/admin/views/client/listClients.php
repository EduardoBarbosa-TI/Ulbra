<div class="col-12 col-sm-12">
    <h2>Lista de Clientes</h2>
    <table class="table table-striped">
        <tr>
            <th>ID Cliente</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Telefone</th>
            <th>Endereço</th>
        </tr>
        <?php
        foreach ($arrayClients as $client) {
        ?>
            <tr>
                <td>
                    <?= $client['idClient'] ?>
                </td>
                <td>
                    <?= $client['name'] ?>
                </td>
                <td>
                    <?= $client['email'] ?>
                </td>
                <td>
                    <?= $client['phone'] ?>
                </td>
                <td>
                    <?= $client['address'] ?>
                </td>
                <td>
                    <a class="btn btn-sm btn-primary me-2" href='?controller=client&action=editClient&id=<?=$client['idClient']?>'><i class="bi bi-pencil"></i></a>
                    <a class="btn btn-sm btn-danger me-2" href='?controller=client&action=deleteClient&id=<?=$client['idClient']?>'><i class="bi bi-trash"></i></a>
                </td>
            </tr>
        <?php
        }
        ?>
    </table>
</div>
</div>
</div>
</div>
</section>