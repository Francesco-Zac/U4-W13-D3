package entities;

public class Carrello {
    public String clienteAssociato;
    public String[] elencoArticoli;
    public int costoTotale;

    public Carrello(String clienteAssociato, String[] elencoArticoli, int costoTotale) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.costoTotale = costoTotale;
    }

}

