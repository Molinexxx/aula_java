package mod9;

public class RG {
    private int numero;
    private String dataNasc;

    // Construtor
    public RG(int numero, String dataNasc) {
        this.numero = numero;
        this.dataNasc = dataNasc;
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    // Para imprimir corretamente o RG
    @Override
    public String toString() {
        return "Número: " + numero + ", Data Nasc: " + dataNasc;
    }
}
