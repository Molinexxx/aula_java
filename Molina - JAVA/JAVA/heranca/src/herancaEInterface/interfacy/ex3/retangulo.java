package herancaEInterface.interfacy.ex3;

public class retangulo implements Forma{
    double altura;
    double largura;

    public retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return  largura*altura;

    }

    public static void main(String[] args) {
        retangulo res = new retangulo(3, 7);


        System.out.println("o valor da sua area é " + res.area());
    }
}
