import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é sua nota: ");
        int idade = sc.nextInt();

        if (idade < 5) {
            System.out.println("vc reprovou");
        } else if (idade <= 7) {
            System.out.println("vc recuperacao");
        } else {
            System.out.println("vc passo de  ano ") ;

        }
    }
}