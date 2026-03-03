package Cap8Lab7;

public class Cap8_Lab1 {

    public static int maiorNumero(int num []){
        int maior = num[0];
        for (int a = 0; a < num.length; a++){
            if (num[a] > maior) {
                maior = num[a];
            }

        }
        return maior;
    }

    public static void main(String[] args){
        int[] numero = {30, 20 , 320 ,10 ,30 , 23 ,1 };
        int resul = maiorNumero(numero);

        System.out.println(resul);



    }
}