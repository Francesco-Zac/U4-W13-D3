package entities;

import java.util.Arrays;
import java.util.Scanner;


public class SIM {
    public int numeroDiTelefono;
    public int credito;
    public String[] listaChiamate;
    int count = 0;

    Scanner scanner = new Scanner(System.in);


    public SIM(int numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = 0;
        this.listaChiamate = new String[5];
        for (int i = 0; i < listaChiamate.length; i++) {
            listaChiamate[i] = "";
        }

    }

    public void ricarica() {
        System.out.println("Quanto vuoi ricaricare? ");
        int importo = scanner.nextInt();
        while (importo < 0) {
            System.out.println("non puoi inserire un importo negativo. Premi 1 per riprovare o 2 per annullare l'operazione");
            int scelta = scanner.nextInt();
            if (scelta == 1) {
                importo = scanner.nextInt();
            } else if (scelta == 2) {
                break;
            } else {
                System.out.println("Inserisci un numero valido");
            }

        }
        if (importo > 1) {
            this.credito += importo;
            System.out.println("Il tuo credito è di " + credito);
        }

    }

    public void aggiungiChiamata(String numeroDaChiamare, String minuti) {
        if (this.credito <= 0) {
            System.out.println("Non hai abbastanza credito per effettuare questa chiamata");
        } else {
            this.listaChiamate[count] = " num: " + numeroDaChiamare + " " + "min: " + minuti;
            this.count += 1;
            this.credito -= 1;
        }
    }

    public void stampaDettagliSIM() {
        System.out.println("Il credito è di €" + credito);
        if (this.count >= 5) {
            System.out.println("Ecco le ultime 5 chiamate " + Arrays.toString(listaChiamate));
        } else {
            System.out.println("Ecco le ultime " + this.count + " chiamate " + Arrays.toString(listaChiamate));
        }

    }
}
