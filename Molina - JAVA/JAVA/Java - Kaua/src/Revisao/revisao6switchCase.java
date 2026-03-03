package Revisao;

import java.util.Scanner;

public class revisao6switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex1
        System.out.println("me fale um numero");
        int aa = sc.nextInt();

        switch (aa){
            case 1:
                System.out.println("cafe");
                    break;
            case 2:
                System.out.println("cha");
                    break;
            case 3:
                System.out.println("suco");
                break;
            case 4:
                System.out.println("refri");
                break;
        }
            //ex2
        System.out.println("coloca um dia da semana em number");
        int sem = sc.nextInt();

        switch (sem) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terca-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            case 5:
                System.out.println("quinta-feira");
                break;
            case 6:
                System.out.println("sexta-feira");
                break;
            case 7:
                System.out.println("sabado");
                break;
        }
        //ex3
        System.out.println("me fala uma dificuldade de 1 a 3");
        int di = sc.nextInt();

        switch (di) {
            case 1:
                System.out.println("facil");
                break;
            case 2:
                System.out.println("medio");
                break;
            case 3:
                System.out.println("Dificil");
                break;
        }
        //ex4
        System.out.println("me opcao de 1 a 4");
        int op = sc.nextInt();

        switch (op){
            case 1:
                System.out.println("Dinheiro");
                break;
            case 2:
                System.out.println("cartao de credito");
                break;
            case 3:
                System.out.println("cartao de debito");
                break;
            case 4:
                System.out.println("Pix");
                break;
        }
        //ex5
        System.out.println("me fala uma letra de A ate B");
        String abe = sc.nextLine();

        switch (abe){
            case "a" :
                System.out.println("Excelente");
                break;
            case "b":
                System.out.println("Bom");
                break;
            case "c":
                System.out.println("Relugar");
                break;
            case "d":
                System.out.println("ruim");
                break;
        }
    }
}
