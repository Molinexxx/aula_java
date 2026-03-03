public class Garagem {
    Carro carroPasseio;
    Carro carroUtilitario;

    public static void main(String[] args) {
        Garagem g = new Garagem();


        g.carroPasseio = new Carro();
        g.carroUtilitario = new Carro();
            // Carro Passeio
        g.carroPasseio.modelo = "creta";
        g.carroPasseio.cor = "vermelho";
        g.carroPasseio.Potencia_motor = 2.5;
            //Carro ultitario
        g.carroUtilitario.modelo = "Gol";
        g.carroUtilitario.cor = "Preto";
        g.carroUtilitario.Potencia_motor = 2.0;



        System.out.println("Carro de Passeio");
        System.out.println("Cor: " + g.carroPasseio.cor);
        System.out.println("Modelo: " + g.carroPasseio.modelo);
        System.out.println("Potencia: " + g.carroPasseio.Potencia_motor);
        System.out.println("---------------------------------------------");
        System.out.println("carro ultitario");
        System.out.println("Cor: " + g.carroUtilitario.cor);
        System.out.println("Modelo: " + g.carroUtilitario.modelo);
        System.out.println("Potencia: " + g.carroUtilitario.Potencia_motor);
    }




}
