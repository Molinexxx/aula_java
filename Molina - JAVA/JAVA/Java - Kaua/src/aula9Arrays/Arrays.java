package aula9Arrays;

public class Arrays {
    public static void main(String[] args) {
        //lista de filmes
        String[] filmes = {"ate a morte nos separe" , "se beber nao case" , "A Mumia" , "Os Deuses Devem Estar Loucos"};

        //utiliando o for paa percorrrer um array
        for (int i = 0; i < filmes.length; i++) {
            System.out.println("esse sao a lista de filmes: " + filmes[i]);
        }

            // lista de numeros ate 5
            int[] number = new int[5];

            number[0] = 8;
            number[1] = 9;
            number[2] = 10;
            number[3] = 11;
            number[4] = 12;

             for (int s = 0; s < number.length;s++){
                 System.out.println("esses sao a lista de idade: " + number[s]);
             }

    }
}
