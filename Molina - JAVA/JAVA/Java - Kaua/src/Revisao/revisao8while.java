package Revisao;

import java.util.Scanner;

public class revisao8while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ex1
        System.out.println("digite o valor inicial");
        int vali = sc.nextInt();
        System.out.println("escreva o valor final");
        int valf = sc.nextInt();

        while(vali < valf){
            vali++;
            System.out.println(vali);
        }
         //ex2 senha
        System.out.println("digite uma senha ");
        String sen = sc.nextLine();

        while (  !sen.equals("admin1234")  ){
                System.out.println("digite novamente");
                sc.nextLine();
        }
        System.out.println("senha correta");
        //ex3
        System.out.println("digite um valor");
        int com = sc.nextInt();

        while (com != 7){
            System.out.println("numero errado");
            com = sc.nextInt();

        }
        System.out.println("numero correto");
        //ex4
        double nota;

        System.out.println("digite uma nota: (0 para encerrar)");
        nota = sc.nextDouble();

        while (nota != 0){
            System.out.println("vc digitou essa nota " + nota);

            System.out.println("digite uma nota: (0 para encerrar)");
            nota = sc.nextDouble();
        }
        System.out.println("programa encerrado");
    }
}
