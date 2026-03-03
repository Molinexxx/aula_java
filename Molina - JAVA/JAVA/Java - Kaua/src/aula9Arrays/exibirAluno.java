package aula9Arrays;

import java.lang.invoke.CallSite;

public class exibirAluno {
    public static void main(String[] args) {
        alunos[] aluno = new alunos[3];



        aluno[0] = new alunos();
        aluno[0].nome = "molina";
        aluno[0].nota = 8.0;

        aluno[1] = new alunos();
        aluno[1].nome = "guilherme";
        aluno[1].nota = 5.6;

        aluno[2] = new alunos();
        aluno[2].nome = "Ronaldo";
        aluno[2].nota = 7.5;

        for (int a = 0; a < aluno.length; a++) {
            System.out.println("alunos: " + aluno[a].nome + " | notas: " + aluno[a].nota);
        }



    }
}
