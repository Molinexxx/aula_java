package mod9;

public class aluno extends Pessoa{
    private float mensalidade;
    private String curso;

    void setMensalidade( float mensalidade){
        this.mensalidade = mensalidade;
    }

    void setCurso (String curso){
        this.curso = curso;
    }

    float getMensalidade(){
        return this.mensalidade;
    }

    String getCurso(){
        return this.curso;
    }
    public aluno(String nome , int idade, char sexo, int numero, String dataNasc, float mensalidade, String curso){
        super(nome, idade, sexo, new RG(numero, dataNasc));
        this.mensalidade = mensalidade;
        this.curso = curso;
    }

    @Override
    public void falar(String fala) {
        System.out.println("contendo o atributo nome da pessoa e o valor do parâmetro informado;");
    }
    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Rg: " + getRg());
        System.out.println("mensalidade: " + getMensalidade());
        System.out.println("Disciplina: " + getCurso());

    }

}
