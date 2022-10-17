 <div class="col-8 col-sm-8">
    <table>
        <h1>Dados do Cadastro</h1>
        <tr>
            <th>Nome</th>
            <td>
                <?= $arrayClient['name'] ?>
            </td>
        </tr>
        <tr>
            <th>email</th>
            <td>
                <?= $arrayClient['email'] ?>
            </td>
        </tr>
        <tr>
            <th>Celular</th>
            <td>
                <?= $arrayClient['cel'] ?>
            </td>
        </tr>
        <tr>
            <th>Genero: </th>
            <td>
                <?= $arrayClient['gender'] ?>
            </td>
        </tr>
        <tr>
            <th>Termo de aceite:</th>
            <td>
                <?= $arrayClient['acceptView'] ?>
            </td>
        </tr>
    </table>
</div> 
