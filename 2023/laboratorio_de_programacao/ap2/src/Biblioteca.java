public class Biblioteca {
    private Livro[] livros =  new Livro[10];
    Livro livro01;
    Livro livro02;
    Livro livro03;
    Livro livro04;
    Livro livro05;


    public Livro getLivro01() {
        return livro01;
    }

    public Livro getLivro02() {
        return livro02;
    }

    public Livro getLivro03() {
        return livro03;
    }

    public Livro getLivro04() {
        return livro04;
    }

    public Livro getLivro05() {
        return livro05;
    }

    public void adicionarLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if (livros[i] == null){
                livros[i] = livro;
                break;
            }else{
                livros[i] = livro;
            }
        }
    }
    public void detalhesLivros() {
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                System.out.println("Espaço do livro" + i + " Disponível para armazenar");
            } else {
                System.out.println("Espaço do livro" + i + " Indisponível para armazenar");
            }
        }
    }
    public void removerLivro(Livro livro){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] == livro){
                livros[i] = null;
            }
        }
    }
    public void atualizarDetalhes(Livro livro, String novotitulo, String novoAutor){
       for(int i = 0; i < livros.length; i++){
           if(livros[i] == livro){
               livros[i].setTitulo(novotitulo);
               livros[i].setAutor(novoAutor);
           }
       }
    }
    public void verificacaoDisponibilidade(int codLivro){
        for(int i = 0; i < livros.length; i++){
            if(livros[i] != null && livros[i].codLivro == codLivro){
                System.out.println("Disponibilidade do livro " + livros[i].getTitulo() + ": " + livros[i].getStatus());
                break;
            }
        }
    }
    public void verificacaoDisponibilidade(String titulo){
       for(int i = 0; i < livros.length; i++){
           if(livros[i] != null && livros[i].titulo == titulo){
               System.out.println("Disponibilidade do livro " + livros[i].getTitulo() + ": " + livros[i].getStatus());
               break;
           }
       }
    }



}
