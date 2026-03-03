import java.util.Scanner;

public class att4switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um numero de 1 a 5, para saber os corredores que deseja ir ");
        int num = sc.nextInt();


        switch (num){
            case 1:
                System.out.println("Alimentos Pereciveis");
                System.out.println("Corredor A");
                    break;
            case 2:
                System.out.println("Limepreza");
                System.out.println("Corredor B");
                    break;
            case 3:
                System.out.println("Eletronicos");
                System.out.println("Corredor C");
                    break;
            case 4:
                System.out.println("Vestuario");
                System.out.println("Corredor D");
                    break;
            case 5:
                System.out.println("Moveis");
                System.out.println("Corredor E");
                    break;
            default:
                System.out.println("Voce Entradou de triagem!");

        }
    }
}
