public class Relogio{

    Ponteiro ponteiroHora;
    Ponteiro ponteiroMinuto;
    Ponteiro ponteiroSegundo;

    public void acertarRelogio(int hora, int minuto, int segundo){
        ponteiroHora = hora;
        int minutosAcertados = minuto / 5 ;
        int segundosAcertados = segundo / 5;

        System.out.println(horasAcertadas + ":" + minutosAcertados + ":" + segundosAcertados);
    }
    public void lerHora(int ponteiroHora){
        int hora_lida = ponteiroHora;
        System.out.println("A hora atual é");

    }
    public void lerMinuto(int ponteiroMinuto){

    }
    public void lerSegundo(int ponteiroSegundo){

    }



}
