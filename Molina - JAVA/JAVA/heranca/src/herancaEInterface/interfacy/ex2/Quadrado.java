package herancaEInterface.interfacy.ex2;

public class Quadrado implements Calculavel{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcular() {
        return lado*lado;
    }

    public static void main(String[] args) {
        Quadrado q = new Quadrado(5);

        System.out.println("A area do quadrado é " + q.calcular());
    }
}
