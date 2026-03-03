import java.util.Scanner;

public class exemploSwit {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        // Swich - case
        System.out.println("Qual mes voce nasceu? ");
        int mes = sc.nextInt();
        switch (mes) {
            case  1:
                System.out.println("Voce nasceu em Janeiro");
                break;
            case  2:
                System.out.println("Voce nasceu em Fevereiro");
                break;
            case  3:
                System.out.println("Voce nasceu em Março");
                break;
            case  4:
                System.out.println("Voce nasceu em abril");
                break;
            case  5:
                System.out.println("Voce nasceu em maio");
                break;
            case  6:
                System.out.println("Voce nasceu em junho");
                break;
            case  7: System.out.println("Voce nasceu em julho");
                break;
            case  8:
                System.out.println("Voce nasceu em agosto");
                break;
            case  9:
                System.out.println("Voce nasceu em Setembro");
                break;
            case  10:
                System.out.println("Voce nasceu em Outubro");
                break;
            case  11:
                System.out.println("Voce nasceu em Novembro");
                break;
            case  12:
                System.out.println("Voce nasceu em Dezembro");

                break;
            default:
                System.out.println(" errou burrinho ");

        }

    }// main

} // class
