package Revisao;

import java.util.Scanner;

public class revisao5AndOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos anos vc tem?");
        int ida = sc.nextInt();

        System.out.println("Voce tem o ingresso?");
        boolean in = sc.nextBoolean();

        if (ida > 18 && in == true){
            System.out.println("entrada permitida");
        } else {
            System.out.println("acesso negado!");
        }
       //ex2
        System.out.println("qual e o valor da comnpra?");
        double com = sc.nextDouble();

        System.out.println("Voce e cliente vip?");
        boolean vip = sc.nextBoolean();

        if (com >= 50 || vip == true){
            System.out.println("Desconto aplicado");
        } else {
            System.out.println("sem desconto");
        }
        //ex3
        System.out.println("informe seu usuario: ");
        String user = sc.nextLine();
        System.out.println("informe sua senha: ");
        String senha = sc.nextLine();

        if (user.equals("batata123") && senha.equals("admin")){
            System.out.println("login realizado");
        } else {
            System.out.println("usario ou senha invalida");
        }

        //ex4
        System.out.println("qual e a sua nota final?");
        double fin = sc.nextDouble();
        System.out.println("Quantos e sua frequencia? ");
        int freq = sc.nextInt();

        if (fin >= 6 && freq > 5){
            System.out.println("aluno aprovado");
        } else {
            System.out.println("aluno reprovado");
        }
        //ex 5

        System.out.println("qual e a distancia da sua casa ate o trabalho");
        double dis = sc.nextDouble();
        System.out.println("se ultiliza transporte publico?");
        boolean bus = sc.nextBoolean();

        if(dis > 2.5 && bus == true ){
            System.out.println("tem direito a beneficio");
        } else {
            System.out.println("nao tem direito ao beneficio");
        }
    }
}
