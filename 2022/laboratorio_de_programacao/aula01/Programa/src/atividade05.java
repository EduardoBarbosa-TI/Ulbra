
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida ou
inválida. Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o mês
e outra para o ano. Considere que fevereiro pode ter somente 28 dias.
*/
public class atividade05 {


    public static void main(String[] args) throws ParseException {
       int dia = 34;
       int mes = 12;
       int ano = 2023;
       String data;

        if(dia>0 && dia<32 && mes>0 && mes<13 && ano>0 && ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) || ((mes==4 || mes==6 || mes==9 || mes==11) && dia<=30) || (mes==2 &&(dia<=29 && ano%4==0 && (ano%100!=0 || ano%400==0))|| dia<=28))){
            data="DATA VÁLIDA";
        }else{
            data="DATA INVÁLIDA";
        }

        System.out.println(dia+"/"+mes+"/"+ano+" *****"+data+"*****");

    }





}