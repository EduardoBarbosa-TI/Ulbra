public class Main {
    public static void main(String[] args) {

        ArvoreBST arvore = new ArvoreBST();

        arvore.inserir(11);
        arvore.inserir(5);
        arvore.inserir(31);
        arvore.inserir(0);
        arvore.inserir(9);
        arvore.inserir(35);
        arvore.inserir(8);
        arvore.inserir(10);

        System.out.print("Em ordem: ");
        arvore.imprimirEmOrdem();

        System.out.print("Pré-ordem: ");
        arvore.imprimirPreOrdem();

        System.out.print("Pós-ordem: ");
        arvore.imprimirPosOrdem();

        System.out.println("Altura da árvore: " + arvore.altura());
        System.out.println("Total de nós: " + arvore.contarNos());
        System.out.println("Total de folhas: " + arvore.contarFolhas());
        System.out.println("Profundidade do nó 35: " + arvore.profundidadeNo(35));

        System.out.println("Buscar 9: " + arvore.buscar(9));
        System.out.println("Removendo 9...");
        arvore.remover(9);

        System.out.print("Em ordem após remover: ");
        arvore.imprimirEmOrdem();
    }
}
