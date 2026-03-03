public class Atividadeex {
    public static void main (String[] args){
        int nota1 = 6;
        int nota2 = 7;
        int nota3 = 6;
        int nota4 = 7;
        int resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        if (resultado >= 7){
            System.out.println("voce foi aprovado com a nota: " + resultado);
        } else if (resultado == 5 || resultado == 6) {
            System.out.println("Voce esta de exame com a nota: " + resultado);
        } else {
            System.out.println("voce esta reprovado com a nota: " + resultado);
        }

    }

}
