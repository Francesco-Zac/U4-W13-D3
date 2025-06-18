import entities.SIM;
import entities.Articoli;
import entities.Cliente;
import entities.Carrello;

public class Main {
    public static void main(String[] args) {
        SIM mioNumero = new SIM(0525252525);

//        mioNumero.stampaDettagliSIM();
//        mioNumero.ricarica();
//        mioNumero.stampaDettagliSIM();
//        mioNumero.aggiungiChiamata("0254565852", "5");
//        mioNumero.stampaDettagliSIM();
//        mioNumero.aggiungiChiamata("1254565852", "3");
//        mioNumero.stampaDettagliSIM();

        Cliente cliente = new Cliente("CL001", "Mario", "Rossi", "mario@example.com", "2024-06-01");

        Articoli articolo1 = new Articoli(1001, "Mouse Wireless", 25, 10);
        Articoli articolo2 = new Articoli(1002, "Tastiera Meccanica", 50, 5);

        int[] codiciArticoli = {articolo1.codiceArticolo, articolo2.codiceArticolo};
        int costoTotale = articolo1.prezzo + articolo2.prezzo;

        Carrello carrello = new Carrello(cliente.codiceCliente, codiciArticoli, costoTotale);

        System.out.println("Cliente: " + cliente.nome + " " + cliente.cognome);
        System.out.println("Articoli nel carrello:");
        for (int codice : carrello.codiciArticoli) {
            if (codice == articolo1.codiceArticolo) {
                System.out.println("- " + articolo1.descrizioneArticolo + ": " + articolo1.prezzo + "€");
            } else if (codice == articolo2.codiceArticolo) {
                System.out.println("- " + articolo2.descrizioneArticolo + ": " + articolo2.prezzo + "€");
            }
        }
        System.out.println("Totale: " + carrello.costoTotale + "€");
    }
    }
}