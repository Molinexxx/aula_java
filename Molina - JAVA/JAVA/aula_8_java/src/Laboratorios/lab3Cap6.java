package Laboratorios;

public class lab3Cap6 {
    public static void main(String[] args) {
        // intenciando objetos
        Aluno joao = new Aluno(); //objetos
        Aluno maria = new Aluno(); // objetos
        Aluno marcos = new Aluno(); // objetos

        //modifica o nome e
        joao.setNome("joao");
        joao.contadorDeAluno++;
        joao.imprimirAluno();

        maria.setNome("Maria");
        maria.contadorDeAluno++;
        maria.imprimirAluno();

        marcos.setNome("marcos");
        marcos.contadorDeAluno++;
        marcos.imprimirAluno();


    }
}
