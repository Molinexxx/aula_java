package aula_11;

public class ReceitaPizza {
    private String sabor;
    private boolean borda_recheada;
    private String tamanho = "grande";

    public ReceitaPizza(String sabor , boolean borda_recheada){
        this.sabor = sabor;
        this.borda_recheada = borda_recheada;
        this.tamanho = tamanho;
    }

    public ReceitaPizza(String sabor){
        this.sabor = sabor;
        this.borda_recheada = borda_recheada;
        this.tamanho = tamanho;
    }
    public void MostrarPizza(){
        System.out.println("Sabor: " + sabor);
        System.out.println("tem borda reaceada? " + borda_recheada);
        System.out.println("So temos o tamanho: " + tamanho);
    }
}
