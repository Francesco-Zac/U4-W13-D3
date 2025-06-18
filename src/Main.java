import entities.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------Es 1--------------------------------------------------");
        Rettangolo ciao = new Rettangolo();
        ciao.stampaRettangolo(20, 20);
        ciao.stampaDueRettangoli(20, 20, 30, 30);


        System.out.println("--------------------------------------Es 2--------------------------------------------------");
        SIM mioNumero = new SIM(0525252525);

        mioNumero.stampaDettagliSIM();
        mioNumero.ricarica();
        mioNumero.stampaDettagliSIM();
        mioNumero.aggiungiChiamata("0254565852", "5");
        mioNumero.stampaDettagliSIM();
        mioNumero.aggiungiChiamata("1254565852", "3");
        mioNumero.stampaDettagliSIM();

        System.out.println("--------------------------------------Es 3--------------------------------------------------");
        Cliente ciccio = new Cliente("C-137", "Ciccio", "Cappuccio", "cicciocappuccio@gmail.com", "15/08/2020");
        Articoli mouse = new Articoli(1, "Mouse", 50, 10);
        Articoli monitor = new Articoli(2, "Monitor", 120, 5);

        Carrello carrello = new Carrello("C-137", new String[]{"1", "2"});

        if (carrello.clienteAssociato.equals(ciccio.codiceCliente)) {
            System.out.println("Cliente: " + ciccio.nome + " " + ciccio.cognome);
        } else {
            System.out.println("Utente non loggato");
        }
        System.out.println("Articoli nel carrello: ");
        for (int i = 0; i < carrello.elencoArticoli.length; i++) {
            String codiceArticolo = carrello.elencoArticoli[i];
            if (codiceArticolo.equals("1")) {
                System.out.println("- " + mouse.descrizioneArticolo + ": " + mouse.prezzo + "€");
                carrello.costoTotale += mouse.prezzo;
            } else if (codiceArticolo.equals("2")) {
                System.out.println("- " + monitor.descrizioneArticolo + ": " + monitor.prezzo + "€");
                carrello.costoTotale += monitor.prezzo;
            }
        }

        System.out.println("il costo totale è: €" + carrello.costoTotale);

    }
}