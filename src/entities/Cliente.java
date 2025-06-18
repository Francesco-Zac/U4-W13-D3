package entities;

public class Cliente {
    public String codiceCliente;
    public String nome;
    public String cognome;
    public String email;
    public String dataDiIscrizione;

    public Cliente(String codiceCliente, String nome, String cognome, String email, String dataDiIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiIscrizione = dataDiIscrizione;
    }
}
