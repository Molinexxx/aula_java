import java.util.Scanner;

public class EX2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // digitar o primeiro numero
        System.out.print("digite um numero ");
        int num1 = sc.nextInt();

        System.out.print("digite segundo numero ");
        int num2 = sc.nextInt();

        System.out.println("a multiplicacao é " + (num1 + num2));
        System.out.println("a subitracão é " + (num1 - num2));
        System.out.println("a divisao é "+ (num1 / num2));
        System.out.println("a subtracão é "+ (num1 * num2));
        System.out.println( "o mudulo é "+ (num1 % num2));
    }
}
