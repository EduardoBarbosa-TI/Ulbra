<div class="col-12 col-sm-12">
    <h2>Cadastro de Clientes</h2>
    <form class="row g-3" method="POST" enctype='multipart/form-data'>
        <div class="col-md-12">
            <label for="validationDefault01" class="form-label">Nome do Cliente</label>
            <input type="text" class="form-control" name="name" id="validationDefault01" required>
        </div>
        <div class="col-md-12">
            <label for="validationDefault02" class="form-label">Telefone</label>
            <input type="" class="form-control" name="phone" id="validationDefault02" required>
        </div>
        <div class="col-md-12">
            <label for="validationDefaultUsername" class="form-label">Email</label>
            <div class="input-group">
                <input type="email" class="form-control" name="email" id="validationDefaultUsername" aria-describedby="inputGroupPrepend2" required>
            </div>
        </div>
        <div class="col-md-12">
            <label for="validationDefault03" class="form-label">Endereço</label>
            <input type="text" name="adreess" class="form-control" id="validationDefault03" required>
        </div>
        <div class="col-md-12">
            <label class="form-label">Foto:</label>
            <input type="file" name="photo" class="form-control" value="Enviar">
        </div>
         
        <div class="col-12">
            <button class="btn btn-primary" type="submit">Submit form</button>
        </div>
    </form>
</div>
</div>
</div>
</div>
</section>