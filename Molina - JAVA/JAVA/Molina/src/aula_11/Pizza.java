package aula_11;

public class Pizza {
    public static void main(String[] args) {
        ReceitaPizza pizzaCalabresa = new ReceitaPizza("calabresa");
        ReceitaPizza pizzaCalabresaRecheada = new ReceitaPizza("calabresa" , true);


        System.out.println("pizza simples");
        pizzaCalabresa.MostrarPizza();
        System.out.println();

        System.out.println("Pizza recheada");
        pizzaCalabresaRecheada.MostrarPizza();
        System.out.println();
    }
}
