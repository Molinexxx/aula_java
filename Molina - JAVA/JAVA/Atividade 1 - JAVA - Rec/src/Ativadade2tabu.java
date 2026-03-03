public class Ativadade2tabu {
    public static void main (String[] args){
        int tabu = 5;
        int x = 0;


        //utilizando while
        while ( x <= 10) {
            int resul = tabu * x;
            System.out.println(tabu + "x" + x + "=" + resul);

            x++;
        }
        // ultilizando for
        int ff = 2;
        for (int f = 0; f <= 10; f++){
            System.out.println( ff + "x" + f + "=" +  (ff * f) );
        }
    }
}
