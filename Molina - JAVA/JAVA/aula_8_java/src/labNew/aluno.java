package labNew;

public class aluno {
    private String nome;
    public static int ContadorAluno = 0;


    String getNome(){
        return this.nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void imprimirAlunos(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("contagem no objeto " + nome + ": " + ContadorAluno);
        System.out.println();
    }
}

