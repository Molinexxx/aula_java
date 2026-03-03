package lab5;

public class testeCalculadora {
    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println(calc.dividir(100,5));
        System.out.println(calc.multiplicar(5, 20));
        System.out.println(calc.subtrair(1000, 900));

        System.out.println("Metodo subtrair sobrecarregados: ");
        System.out.println("Chamado a versao de subtrair com 2 double: " + calc.subtrair(43.5, 25.3));
        System.out.println("Chamado a versao de subtrair com 1 double e um int: "+ calc.subtrair(25.5,23));
        System.out.println("Chamado a versao de subtrair com 1 int e um double: "+ calc.subtrair(34,23.6));
    }
}
