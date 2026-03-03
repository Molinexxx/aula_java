package aula_11;

public class bolo {
    public static void main(String[] args) {
       /* receitaBolo boloMorango = new receitaBolo();

        boloMorango.Cobertura = "chocolate";
        boloMorango.sabor = "morango";
        boloMorango.preco = 19.90;
        */
        // craindo os bgl
        receitaBolo boloCenoura = new receitaBolo("Morango", "cenoura");
        receitaBolo boloFesta = new receitaBolo("chantilly" , "abacaxi" , 29.90 ,"2kg" , "morango");
        boloFesta.MostrarBolo();
    }
}
