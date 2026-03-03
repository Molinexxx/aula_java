package herancaEInterface.interfacy.ex3;

public class Circulo implements Forma{
    double pi = 3.14;
    double lado;

    public Circulo(double lado){
        this.lado = lado;
    }

    @Override
    public double area() {
        return pi*lado*lado;
    }

    public static void main(String[] args) {
        Circulo res = new Circulo(5);

        System.out.println("area é " + res.area());
    }
}
