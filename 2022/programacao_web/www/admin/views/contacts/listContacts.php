<div class="col-12 col-sm-12">
    <h2>Lista de Contatos</h2>
    <table class="table table-striped">
        <tr>
            <th>ID Contato</th>
            <th>Nome</th>
            <th>Email</th>
            <th>Mensagem</th>
            <th>Status</th>
            <th>Descrição</th>
        </tr>
        <?php
            foreach($arrayContacts as $contact){
        ?>
            <tr>
                <td>
                    <?=$contact['idContact']?>
                </td>
                <td>
                    <?=$contact['name']?>
                </td>
                <td>
                    <?=$contact['email']?>
                </td>
                <td>
                    <?=$contact['message']?>
                </td>
                <td>
                    <?=$contact['status']?>
                </td>
                <td>
                    <?=$contact['description']?>
                </td>
                <td>
                    <button class="btn btn-sm btn-primary me-2"><i class="bi bi-pencil"></i></button>
                    <button class="btn btn-sm btn-danger me-2"><i class="bi bi-trash"></i></button>
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