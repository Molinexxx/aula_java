package aula_7;

public class aluno {
    private String nome;
    public static int contagemAlunos= 0;

    public void aluno(String nome){
        this.nome = nome;
        contagemAlunos++;
    }

    public  String getNome(){
        return nome;
    }
        public void setNome(){
            this.nome = nome;
        }

}
