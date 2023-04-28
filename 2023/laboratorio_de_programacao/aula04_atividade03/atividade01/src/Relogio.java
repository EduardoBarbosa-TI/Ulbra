public class Relogio{
    Ponteiro ponteiroHora ;
    Ponteiro ponteiroMinuto ;
    Ponteiro ponteiroSegundo ;

    public Relogio(){
        ponteiroHora = new Ponteiro(7);
        ponteiroMinuto = new Ponteiro(5);
        ponteiroSegundo = new Ponteiro(6);
    }

    public void acertarRelogio(int hora, int minuto, int segundo){
        int horasAcertadas = hora;
        int minutosAcertados = minuto / 5 ;
        int segundosAcertados = segundo / 5;

        System.out.println(horasAcertadas + ":" + minutosAcertados + ":" + segundosAcertados);
    }
    public int lerHora(){
        return ponteiroHora.posicao;
    }
    public int lerMinuto(){
        return ponteiroMinuto.posicao * 5;
    }
    public int lerSegundo(){
        return ponteiroSegundo.posicao * 5;
    }



}
