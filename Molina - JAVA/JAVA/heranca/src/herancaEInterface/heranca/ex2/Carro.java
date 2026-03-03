package herancaEInterface.heranca.ex2;

public class Carro extends Veiculo {
    @Override
    public void mostrarMarca(String marca) {
        super.mostrarMarca(marca);
    }

    public static void main(String[] args) {
        Veiculo car = new Veiculo();

        car.mostrarMarca("toyota");
    }
}
