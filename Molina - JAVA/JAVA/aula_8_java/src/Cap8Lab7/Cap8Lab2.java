package Cap8Lab7;

public class Cap8Lab2 {
    public static void main(String[] args) {
        int soma = 0;
        if (args.length > 0 ){
            for (int k = 0; k < args.length; k++){
                soma += Integer.parseInt(args[k]);
            }
        } else {
            System.out.println("Entre com valores válidos para as idades");
        }
        double media = soma / args.length;

        System.out.println("media das idade:");
        System.out.println("34, 25, 26, 46");
        System.out.println("e de : " + media + " anos");

    }
}
