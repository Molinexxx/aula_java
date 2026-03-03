package Revisao;

import java.util.Scanner;

public class revisao3Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual vai ser seu nick name? ");
        String nick = sc.nextLine();
        System.out.println("Qual e seu jogo favorito? ");
        String jogo = sc.nextLine();
        System.out.println("qual e sua pontuacao? ");
        int pont = sc.nextInt();

        //ex 2
         System.out.println("qual e o valor de entrada do caixa?");
        int val = sc.nextInt();
        System.out.println("qual e o valor de saida?");
        int val1 = sc.nextInt();
        System.out.println("esse e o resultado do caixa: " + (val - val1));

        //ex3
        System.out.println("Qual e o nome do filme? ");
        String filme = sc.nextLine();
        System.out.println("qual e a nota que vc da para o filme?");
        double nota = sc.nextDouble();
        System.out.println("vc recomenda o filme?");
        boolean recomed = sc.nextBoolean();

        //ex4
       System.out.println("Qual e o nome da marca do carro? ");
        String marca = sc.nextLine();
        System.out.println("qual e o ano do veiculo?");
        int va = sc.nextInt();
        System.out.println("qual e o valor do carro?");
        double noa = sc.nextDouble();
        System.out.println("entao seu carro e " + marca + " e o ano dele e " + va + " e custou " + noa + " esse valor?");

         //ex5
        System.out.println("Qual e o nome do evento ? ");
        String evento = sc.nextLine();
        System.out.println("Quantos participante vai ter?");
        int qnt = sc.nextInt();
        System.out.println("A entrata vai ser gratuita ?");
        boolean ent = sc.nextBoolean();

        System.out.println("o nome do evento sera " + evento);
        System.out.println("quantidade de participante " + qnt);
        System.out.println("o evento sera gratuito? " + ent);

    }

}
