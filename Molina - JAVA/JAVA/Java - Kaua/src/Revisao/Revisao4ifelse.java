package Revisao;

import java.util.Scanner;

public class Revisao4ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Qual e a temperatura? ");
        double temp = sc.nextDouble();

        if (temp > 10 ){
            System.out.println("o dia esta muito quente");
        } else {
            System.out.println("o clima esta agradevel");
        }
        //ex 2
       System.out.println("qual e o valor da energia");
        int enrg = sc.nextInt();

        if (enrg > 30){
            System.out.println("energia sufciente");
        } else {
            System.out.println("energia baixa");
        }
        // ex 3
        System.out.println("qual e a sua senha? ");
        String senha = sc.nextLine();
        String aa = "violao";

        if (aa == senha ){
            System.out.println("acesso permitido");
        } else {
            System.out.println("senha incorreta");
        }
        //ex4
         System.out.println("fale o valor do produto em dolar ");
        double dolar = sc.nextDouble();

        if (dolar > 70){
            System.out.println("ele sera taxado");
        } else {
            System.out.println("Produto isento de taxa");
        }
         // ex5
        System.out.println(" qual e a vida do personagem?");
        int vd = sc.nextInt();

        if (vd == 0) {
            System.out.println("gamer over");
        } else {
            System.out.println("o personagem esta vivo");
        }
    }
}
