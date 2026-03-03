package herancaEInterface.heranca.ex3;

public class aluno extends Pessoa{
    String curso;

    public aluno(String nome, String curso){
        super(nome);
        this.curso = curso;
    }

    public void mostrarCurso(){
        System.out.println("Eu estudo " + curso);
    }

    public static void main(String[] args) {
        aluno al = new aluno("Nando", "ADS");

        al.apresentar();
        al.mostrarCurso();
    }
}
