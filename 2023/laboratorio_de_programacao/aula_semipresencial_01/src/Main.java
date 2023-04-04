public class Main {
    public static void main(String[] args) {


        Prova aluno01_prova01 = new Prova(4.0,2.5);
        Prova aluno01_prova02 = new Prova(1.0,7.0);

        Prova aluno02_prova01 = new Prova(6.5,3.5);
        Prova aluno02_prova02 = new Prova(0.0,3.0);

        Prova aluno03_prova01 = new Prova(5.0,4.0);
        Prova aluno03_prova02 = new Prova(6.0,1.5);

        Aluno aluno01 = new Aluno(aluno01_prova01,aluno01_prova02);
        Aluno aluno02 = new Aluno(aluno02_prova01,aluno02_prova02);
        Aluno aluno03 = new Aluno(aluno03_prova01,aluno03_prova02);

        Turma turma = new Turma(aluno01,aluno02,aluno03);

        System.out.println("Média de cada aluno :");
        System.out.println("Aluno_01: " + turma.aluno01.calcularMedia());
        System.out.println("Aluno_02: " + turma.aluno02.calcularMedia());
        System.out.println("Aluno_03: " + turma.aluno03.calcularMedia());

        System.out.println("Média da turma: " + turma.calcularMedia());





    }
}