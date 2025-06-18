import entities.SIM;


public class Main {
    public static void main(String[] args) {
        SIM mioNumero = new SIM(0525252525);

        mioNumero.stampaDettagliSIM();
        mioNumero.ricarica();
        mioNumero.stampaDettagliSIM();
        mioNumero.aggiungiChiamata("0254565852", "5");
        mioNumero.stampaDettagliSIM();
        mioNumero.aggiungiChiamata("1254565852", "3");
        mioNumero.stampaDettagliSIM();


    }
}