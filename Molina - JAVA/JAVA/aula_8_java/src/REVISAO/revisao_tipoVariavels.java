package REVISAO;

public class revisao_tipoVariavels {
    public static void main(String[] args) {
        //ex 1
        int al_sala = 9;
        int comp_sala = 12;

        System.out.println("Essa e a soma dos alunos e os computadores " + al_sala + comp_sala);

        //ex2

        double precoProduto = 39.99;
        double desconto = 9.99;

        System.out.println("o produto com o desconto fica esse preco: R$" + (precoProduto - desconto));
        //ex3

        String jogo = "Fivem";
        String emp = "epic games";

        System.out.println("O jogo " + jogo +" foi desenvolvido pela empresa " + emp);

        //ex4

            boolean user = false;
            boolean logado = true;

            if (logado == true){
                System.out.println("o usuario ta logado");
            }

            if (user == true ){
                System.out.println("ele e maior de idade");
            } else {
                System.out.println("ele e de menor");
            }

            //ex 5

            String produto = "sabonete";
            int quantidade = 3;
            double preco = 3.99;
            double res = quantidade * preco;

        System.out.println("Produto: "+ produto+ " | Quantidade: " +quantidade+ " | Total: R$" + res);
    }


}
