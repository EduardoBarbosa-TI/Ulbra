public class Main {
    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa();
        pessoa01.setNome("Eduardo");
        pessoa01.setIdade(18);
        pessoa01.setAltura(1.68);

        System.out.println(pessoa01.getNome());
        System.out.println(pessoa01.getIdade());
        System.out.println(pessoa01.getAltura());

    }
}