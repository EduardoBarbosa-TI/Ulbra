public class Main {
    public static void main(String[] args) {
        Biblioteca ulbraLib =  new Biblioteca();


        Livro codigoLimpo = new Livro();
        codigoLimpo.setTitulo("Código Limpo",1);
        codigoLimpo.setSetor("A#5");
        codigoLimpo.setAutor("Robert C. Martin");
        codigoLimpo.setDataPublicacao("2008/08/01");
        codigoLimpo.setStatus("Alugado");

        ulbraLib.adicionarLivro(codigoLimpo);
        System.out.println(codigoLimpo.detalhesProduto());
        ulbraLib.verificacaoDisponibilidade("Código Limpo");
        ulbraLib.verificacaoDisponibilidade(1);
        System.out.println(" ");

        Livro oCodificadorLimpo = new Livro();
        oCodificadorLimpo.setTitulo("O Codificador Limpo",2);
        oCodificadorLimpo.setSetor("A#6");
        oCodificadorLimpo.setAutor("Robert C. Martin");
        oCodificadorLimpo.setDataPublicacao("2008/08/01");
        oCodificadorLimpo.setStatus("Disponível");

        ulbraLib.adicionarLivro(oCodificadorLimpo);
        System.out.println(oCodificadorLimpo.detalhesProduto());
        ulbraLib.verificacaoDisponibilidade("O Codificador Limpo");
        ulbraLib.verificacaoDisponibilidade(2);
        System.out.println(" ");

        Livro arquiteturaLimpa = new Livro();
        arquiteturaLimpa.setTitulo("Arquitetura Limpa",3);
        arquiteturaLimpa.setSetor("A#6");
        arquiteturaLimpa.setAutor("Robert C. Martin");
        arquiteturaLimpa.setDataPublicacao("2008/08/01");
        arquiteturaLimpa.setStatus("Alugado");

        ulbraLib.adicionarLivro(arquiteturaLimpa);
        System.out.println(arquiteturaLimpa.detalhesProduto());
        ulbraLib.verificacaoDisponibilidade("Arquitetura Limpa");
        ulbraLib.verificacaoDisponibilidade(3);
        System.out.println(" ");

        Livro pequenoPrincipe = new Livro();
        pequenoPrincipe.setTitulo("Pequeno Príncipe",4);
        pequenoPrincipe.setSetor("B#1");
        pequenoPrincipe.setAutor("Antoine de saint-Exupéry");
        pequenoPrincipe.setDataPublicacao("1943/04/06");
        pequenoPrincipe.setStatus("Disponível");

        ulbraLib.adicionarLivro(pequenoPrincipe);
        System.out.println(pequenoPrincipe.detalhesProduto());
        ulbraLib.verificacaoDisponibilidade("Pequeno Príncipe");
        ulbraLib.verificacaoDisponibilidade(4);
        System.out.println(" ");

        Livro aVoltaDosqueNaoForam = new Livro();
        aVoltaDosqueNaoForam.setTitulo("A Volta Dos Que Não Foram",5);
        aVoltaDosqueNaoForam.setSetor("C#1");
        aVoltaDosqueNaoForam.setAutor("Platão");
        aVoltaDosqueNaoForam.setDataPublicacao("500 a.C.");
        aVoltaDosqueNaoForam.setStatus("Alugado");

        ulbraLib.adicionarLivro(aVoltaDosqueNaoForam);
        System.out.println(aVoltaDosqueNaoForam.detalhesProduto());
        ulbraLib.verificacaoDisponibilidade("A Volta Dos Que Não Foram");
        ulbraLib.verificacaoDisponibilidade(5);

        System.out.println(" ");
        ulbraLib.detalhesLivros();

        Livro updateCodigoLimpo = new Livro();
        updateCodigoLimpo.setTitulo("Código Limpo",1);
        updateCodigoLimpo.setSetor("A#5");
        updateCodigoLimpo.setAutor("Robert C. Martin");
        updateCodigoLimpo.setDataPublicacao("2008/08/01");
        updateCodigoLimpo.setStatus("Disponível");

        ulbraLib.atualizarDetalhes(updateCodigoLimpo);
        System.out.println(" ");
        ulbraLib.verificacaoDisponibilidade(1);

        Livro aObra = new Livro();
        aObra.setTitulo("Qual é a tua obra?",6);
        aObra.setSetor("D#1");
        aObra.setAutor("Mário Sergio Cortella");
        aObra.setDataPublicacao("1943/04/06");
        aObra.setStatus("Disponível");

        ulbraLib.adicionarLivro(aObra);

        System.out.println(" ");
        ulbraLib.detalhesLivros();

        ulbraLib.removerLivro(pequenoPrincipe);

        System.out.println(" ");
        ulbraLib.detalhesLivros();
    }
}