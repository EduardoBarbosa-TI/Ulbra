public class Biblioteca {
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
        if(livro01 == null || livro02 == null || livro03 == null || livro04 == null || livro05 == null){
            if(livro01 == null ){
                livro01 = livro;
            } else if (livro02 == null) {
                livro02 = livro;
            } else if(livro03 == null){
                livro03 =  livro;
            } else if(livro04 == null){
                livro04 =  livro;
            }else if(livro05 == null){
                livro05 = livro;
            }
        }else{
            livro01 = livro;
        }
    }
    public void detalhesLivros(){
        String statusLivro01 = (livro01 == null) ? "Espaço do livro01 Disponível para armazenar" : livro01.titulo;
        String statusLivro02 = (livro02 == null) ? "Espaço do livro02 Disponível para armazenar" : livro02.titulo;
        String statusLivro03 = (livro03 == null) ? "Espaço do livro03 Disponível para armazenar" : livro03.titulo;
        String statusLivro04 = (livro04 == null) ? "Espaço do livro04 Disponível para armazenar" : livro04.titulo;
        String statusLivro05 = (livro05 == null) ? "Espaço do livro05 Disponível para armazenar" : livro05.titulo;

        System.out.println("Livros disponíveis em nossa biblioteca: ");
        System.out.println(statusLivro01);
        System.out.println(statusLivro02);
        System.out.println(statusLivro03);
        System.out.println(statusLivro04);
        System.out.println(statusLivro05);
    }
    public void removerLivro(Livro livro){
        if(livro01.codLivro == livro.codLivro || livro02.codLivro == livro.codLivro || livro03.codLivro == livro.codLivro || livro04.codLivro == livro.codLivro || livro05.codLivro == livro.codLivro){
            if(livro01.codLivro == livro.codLivro){
                livro01 = null;
            } else if (livro02.codLivro == livro.codLivro) {
                livro02 = null;
            } else if(livro03.codLivro == livro.codLivro){
                livro03 =  null;
            } else if(livro04.codLivro == livro.codLivro){
                livro04 =  null;
            }else if(livro05.codLivro == livro.codLivro){
                livro05 = null;
            }
        }else{
            System.out.println("Livro não encontrado !");
        }

    }
    public void atualizarDetalhes(Livro livro){
        if(livro01.codLivro == livro.codLivro || livro02.codLivro == livro.codLivro || livro03.codLivro == livro.codLivro || livro04.codLivro == livro.codLivro || livro05.codLivro == livro.codLivro){
            if(livro01.codLivro == livro.codLivro){
                livro01.setTitulo(livro.titulo,livro.codLivro);
                livro01.setAutor(livro.autor);
                livro01.setDataPublicacao(livro.dataPublicacao);
                livro01.setStatus(livro.status);
                livro01.setSetor(livro.setor);
            } else if (livro02.codLivro == livro.codLivro) {
                livro02.setTitulo(livro.titulo,livro.codLivro);
                livro02.setAutor(livro.autor);
                livro02.setDataPublicacao(livro.dataPublicacao);
                livro02.setStatus(livro.status);
                livro02.setSetor(livro.setor);
            } else if(livro03.codLivro == livro.codLivro){
                livro03.setTitulo(livro.titulo,livro.codLivro);
                livro03.setAutor(livro.autor);
                livro03.setDataPublicacao(livro.dataPublicacao);
                livro03.setStatus(livro.status);
                livro03.setSetor(livro.setor);
            } else if(livro04.codLivro == livro.codLivro){
                livro04.setTitulo(livro.titulo,livro.codLivro);
                livro04.setAutor(livro.autor);
                livro04.setDataPublicacao(livro.dataPublicacao);
                livro04.setStatus(livro.status);
                livro04.setSetor(livro.setor);
            }else if(livro05.codLivro == livro.codLivro){
                livro05.setTitulo(livro.titulo,livro.codLivro);
                livro05.setAutor(livro.autor);
                livro05.setDataPublicacao(livro.dataPublicacao);
                livro05.setStatus(livro.status);
                livro05.setSetor(livro.setor);
            }
        }else{
            System.out.println("Livro não encontrado !");
        }
    }
    public void verificacaoDisponibilidade(int codLivro){
        if(livro01.codLivro == codLivro || livro02.codLivro == codLivro || livro03.codLivro == codLivro || livro04.codLivro == codLivro || livro05.codLivro == codLivro){
            if(livro01.codLivro == codLivro){
                System.out.println("Disponibilidade do livro " + livro01.getTitulo() + ": " + livro01.getStatus());
            } else if (livro02.codLivro == codLivro) {
                System.out.println("Disponibilidade do livro " + livro02.getTitulo() + ": " + livro02.getStatus());
            } else if(livro03.codLivro == codLivro){
                System.out.println("Disponibilidade do livro " + livro03.getTitulo() + ": " + livro03.getStatus());
            } else if(livro04.codLivro == codLivro){
                System.out.println("Disponibilidade do livro " + livro04.getTitulo() + ": " + livro04.getStatus());
            }else if(livro05.codLivro == codLivro){
                System.out.println("Disponibilidade do livro " + livro05.getTitulo() + ": " + livro05.getStatus());
            }
        }else{
            System.out.println("Livro não encontrado !");
        }
    }
    public void verificacaoDisponibilidade(String titulo){
        if(livro01.titulo == titulo || livro02.titulo == titulo || livro03.titulo == titulo || livro04.titulo == titulo || livro05.titulo == titulo){
            if(livro01.titulo == titulo){
                System.out.println("Disponibilidade do livro " + livro01.getTitulo() + ": " + livro01.getStatus());
            } else if (livro02.titulo == titulo) {
                System.out.println("Disponibilidade do livro " + livro02.getTitulo() + ": " + livro02.getStatus());
            } else if(livro03.titulo == titulo){
                System.out.println("Disponibilidade do livro " + livro03.getTitulo() + ": " + livro03.getStatus());
            } else if(livro04.titulo == titulo){
                System.out.println("Disponibilidade do livro " + livro04.getTitulo() + ": " + livro04.getStatus());
            }else if(livro05.titulo == titulo){
                System.out.println("Disponibilidade do livro " + livro05.getTitulo() + ": " + livro05.getStatus());
            }
        }else{
            System.out.println("Livro não encontrado !");
        }
    }



}
