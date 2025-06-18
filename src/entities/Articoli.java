package entities;

public class Articoli {
    public int codiceArticolo;
    public String descrizioneArticolo;
    public int prezzo;
    public int numeroPezziDisponibili;

    public Articoli(int codiceArticolo, String descrizioneArticolo, int prezzo, int numeroPezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }
}
