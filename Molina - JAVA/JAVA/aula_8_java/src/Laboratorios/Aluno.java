package Laboratorios;

public class Aluno {
    private String nome;
    public static int contadorDeAluno = 0 ;



    String getNome(){  // get e para pegar
        return this.nome;
    }
    void setNome(String nome){   //colocar alguma coisa
        this.nome = nome;
    }

    void imprimirAluno(){
        System.out.println("aluno: " + nome);
        System.out.println("Contagem do objeto: " + nome + ": "+ contadorDeAluno);
        System.out.println();
    }
}


