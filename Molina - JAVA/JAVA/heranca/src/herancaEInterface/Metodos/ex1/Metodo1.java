package herancaEInterface.Metodos.ex1;

public class Metodo1 {
    double preco;
    int quant;
    public  Metodo1(double preco, int quant){
        this.preco = preco;
        this.quant = quant;
    }

    double resul(){
       return preco*quant;
    }

    public static void main(String[] args) {
        Metodo1 net = new Metodo1(59.99, 4);

        double resul = net.resul();
        System.out.println("O preco total do seu carrinho e de " + resul);
    }
}
