import java.util.Scanner;

public class ex2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual pais voce é? ");
        String pais = sc.nextLine();



        switch (pais) {
            case "brasil":
                System.out.println("Bom dia");
             break;
            case "Mexico":
            case "Argentina":
            case "Espanha":
                System.out.println("buen día");
             break;
            case "frances":
                System.out.println("bonjour");
             break;
            default:
                System.out.println("good morning");

        }
    }//main
}//class
