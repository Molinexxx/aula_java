import java.util.Scanner;

public class usandoPersonagem {
    public static void main(String[] args){
        guerreiro pedro = new guerreiro();
        Pessoa carlinhas = new Pessoa();
        Car uno = new Car();
        Scanner sc = new Scanner(System.in);

        /// primeiro personagem
             pedro.ataque = 140;
             pedro.genero = "masculino modificado";
             pedro.nome = "guerreiro ronaldo";
             pedro.vida = 200;

        /// Segundo personagem
            carlinhas.ataque = 180;
            carlinhas.genero = "femia";
            carlinhas.Nome = "valquiria deorei";
            carlinhas.vida = 220;


        /// carro

            uno.marca = "fiat";
            uno.anoCar =  2010;
            uno.cor = "branco";
            uno.MaxVelocidade = 170;
            uno.ligado = false;


            uno.ligar();
            pedro.MostrarDados1();


        System.out.println(uno.ligado);

    }
}
