import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Tipo de dado - texto
        System.out.print("digite seu nome: ");
        String nome = sc.nextLine();

        // Tipo de dado - numerico
        System.out.print("qual foi o ano que você nasceu? ");
        int anoNascimento = sc.nextInt();

        // Prints das perguntas
        System.out.println("o nome digitado foi " + nome );
        System.out.print("O ano em que nasceu foi " + anoNascimento );
    }

}