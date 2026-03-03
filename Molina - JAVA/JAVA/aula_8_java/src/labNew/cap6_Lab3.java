package labNew;

public class cap6_Lab3 {
    public static void main(String[] args) {
        aluno joao = new aluno();
        aluno maria = new aluno();
        aluno marcos = new aluno();

        joao.setNome("joao");
        joao.ContadorAluno++;
        joao.imprimirAlunos();

        maria.setNome("maria");
        maria.ContadorAluno++;
        maria.imprimirAlunos();

        marcos.setNome("marcos");
        marcos.ContadorAluno++;
        marcos.imprimirAlunos();
    }
}
