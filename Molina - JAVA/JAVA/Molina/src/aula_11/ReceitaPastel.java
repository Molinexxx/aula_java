package aula_11;

public class ReceitaPastel {
    private double valor;
    private String sabor;
    private String tamanho;

    public ReceitaPastel(String sabor){
        this.sabor = sabor;
        this.valor = 12;
        this.tamanho = "medio";
    }
    public ReceitaPastel(String sabor , String tamanho){
        this.sabor = sabor;
        this.valor = 22;
        this.tamanho = tamanho;
    }
    public void MostrarPastel(){
        System.out.println("sabor do pastel: " + sabor);
        System.out.println("valor do pastel: " + valor);
        System.out.println("tamanho do pastel: " + tamanho);
    }
}
