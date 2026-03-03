package herancaEInterface.Metodos.ex2;

public class Metodo2 {
    int vidaAtual = 20;
    int curaInstantanea = 10;

    int retornaVida(){
        while (vidaAtual < 100){
            vidaAtual = vidaAtual + curaInstantanea;
        }
        return vidaAtual;
    }

    public static void main(String[] args) {
        Metodo2 vd = new Metodo2();

        int vida = vd.vidaAtual;
        int cura = vd.retornaVida();

        System.out.println("essa e sua vida atual " + vida);
        System.out.println("Voce foi curado, agr sua vida e de " + cura);
    }
}
