public class Usuario implements IPersistente{
    @Override
    public void buscar() {
        System.out.println("Buscando o usuário...");
    }
    @Override
    public void salvar() {
        System.out.println("Salvando o usuário...");
    }
    @Override
    public void atualizar() {
        System.out.println("Atualizando o usuário...");
    }
    @Override
    public void deletar() {
        System.out.println("Deletando o usuário");
    }
}
