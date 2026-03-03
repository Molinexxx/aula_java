import java.util.Scanner;

public class exercicio {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        // ano que nasceu
        System.out.print("Qual é o ano que vc nasceu? ");
        int nasceu = sc.nextInt();

        // ano atual
        System.out.print("qual é o ano atual? ");
        int atual = sc.nextInt();

        System.out.println(atual - nasceu);
    }
}
