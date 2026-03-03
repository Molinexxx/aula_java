package herancaEInterface.Arrys.ex3;


public class Ex3_arrays {
    public static void main(String[] args) {
        int num[] = {20, 300 , 10 , 60, 203};
        int maior = num[0];

        for (int a = 0 ; a < num.length; a++){

            if (num[a] > maior){
                maior = num[a];

            }
        }
        System.out.println("esse e o maior numero " + maior);

    }
}
