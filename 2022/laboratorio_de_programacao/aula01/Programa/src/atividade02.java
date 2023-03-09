public class atividade02 {
    public static void main(String[] args) {
        System.out.println("----- ATIVIDADE 01 -----");
        for(int i = 10; i <= 25; i++ ){
            System.out.println(i);
        }

        System.out.println("----- ATIVIDADE 02 -----");
        int somaQuestao01 = 0;
        for(int i = 1; i <= 100; i++){
            somaQuestao01 += i;
            i++;
        }
        System.out.println(somaQuestao01);

        System.out.println("----- ATIVIDADE 03 -----");
        int somaQuestao02 = 0;
        for (int i = 0; i <= 100; i++){
            somaQuestao02 += i;
            if(somaQuestao02 < 100){
                System.out.println(somaQuestao02);
            }
        }

        System.out.println("----- ATIVIDADE 04 -----");
        int result = 9;
        for(int i = 0; i <=10; i++){
           result = 9 * i;
            System.out.println("9 X " + i + " = " + result);
        }

    }
}