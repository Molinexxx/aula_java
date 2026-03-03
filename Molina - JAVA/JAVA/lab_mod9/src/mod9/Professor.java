package mod9;

public class  Professor extends Pessoa{
    private float salario;
    private String disciplina;

    Float getSalario (){
        return this.salario;
    }

    String getDisciplina(){
        return  this.disciplina;
    }

    void setSalario(float salario){
        this.salario = salario;
    }

    void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }

    public Professor(String nome , int idade, char sexo, int numbeRg, String dataNasc, float salario, String disciplina){
        super(nome, idade, sexo, new RG(numbeRg,dataNasc));
        this.disciplina = disciplina;
        this.salario = salario;
    }

    @Override
    public void falar(String fala) {
        System.out.println(fala);
    }

    @Override
    public void mostrarDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Rg: " + getRg());
        System.out.println("Salario: " + getSalario());
        System.out.println("Disciplina: " + getDisciplina());

    }
}


