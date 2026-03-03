package herancaEInterface.Metodos.ex3;

public class Boletinho {
    int[] num = new int[3];


    int calcularMedia( int[] num){
        int media = ( num[0] + num[1] + num[2] ) / 3;
        return media;
    }

    void verificarSituacao(){
        if(calcularMedia(num) >= 7){
            System.out.println("ele esta aprovado");
        } else {
            System.out.println("Voce esta reprovado!");
        }
    }

    public static void main(String[] args) {
        Boletinho bol = new Boletinho();
        int[] num = {6, 9, 7};

        int media = bol.calcularMedia(num);

        System.out.println("Sua media é " + media);
        bol.verificarSituacao();

    }
}
