package Laboratorios;

public class mod1cap6 {
    int Subtrair(int valor1, int valor2) {
        int resultado;
        resultado = valor1 - valor2;
        return resultado;
    }
        public static int Mutiplicar(int valor1, int valor2) {
            int resultado;
            resultado = valor1 * valor2;
            return resultado;
        }
        public static int Dividir(int valor1, int valor2){
        int resultado;
        resultado = valor1 / valor2;
        return  resultado;

        }

    double Subtrair(double num1, double num2){
        double resul;
        resul = num1 - num2;
        return resul;
    }


    public static void main(String[] args) {
        int mult = Mutiplicar(3,5);
        int div = Dividir(100, 5);


        System.out.println("subtracao de 10 - 5:  "  );
        System.out.println("Mutiplicacao de 3 x 5: " + mult );
        System.out.println("Divisao de 100 / 5: " + div );

    }
}

