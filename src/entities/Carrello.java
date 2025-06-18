package entities;

public class Carrello {
    public Cliente clienteAssociato;
    public String[] elencoArticoli;
    public int costoTotale;

    public Carrello(Cliente clienteAssociato, String[] elencoArticoli, int costoTotale) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = elencoArticoli;
        this.costoTotale = costoTotale;
    }

}

