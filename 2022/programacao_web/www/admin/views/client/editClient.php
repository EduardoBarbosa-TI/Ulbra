<div class="col-12 col-sm-12">
    <h2>Editar Cliente</h2>
    <form class="row g-3" action="?controller=client&action=saveEditClient" method="POST">
    <?php
        foreach ($arrayClients as $client) {
        ?>
        <div class="col-md-12">
            <label for="validationDefault01" class="form-label">Nome do Cliente</label>
            <input type="text" class="form-control" name="name" id="validationDefault01" value="<?= $client['name'] ?>" required>
        </div>
        <div class="col-md-12">
            <label for="validationDefault02" class="form-label">Telefone</label>
            <input type="" class="form-control" name="phone" id="validationDefault02" value="<?= $client['phone'] ?>" required>
        </div>
        <div class="col-md-12">
            <label for="validationDefaultUsername" class="form-label">Email</label>
            <input type="email" class="form-control" name="email" id="validationDefaultUsername" aria-describedby="inputGroupPrepend2" value="<?= $client['email'] ?>" required>
        </div>
        <div class="col-md-12"> 
            <label for="validationDefault03" class="form-label">Endereço</label>
            <input type="text" name="address" class="form-control" id="validationDefault03" value="<?= $client['address'] ?>" required>
            <input type="text" name="idClient" value="<?= $client['idClient'] ?>">
        </div>
       
        <div class="col-md-12">
            <label for="validationDefault03" class="form-label">Endereço</label>
            <input type="text" name="adreess" class="form-control" id="validationDefault03" required>
        </div>
        <div class="col-12">
            <button class="btn btn-primary" type="submit">Submit form</button>

        </div>
        <?php
        }
        ?>
    </form>
</div>
</div>
</div>
</div>
</section>