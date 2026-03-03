package mod9;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private RG rg;

    public Pessoa(String nome, int idade, char sexo, RG rg){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.rg = rg;
    }

    String getNome(){
        return this.nome;
    }
    int getIdade(){
        return this.idade;
    }
    char getSexo(){
        return  this.sexo;
    }
    RG getRg (){
        return this.rg;
    }

    void setNome(String nome){
        this.nome = nome;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    void setSexo(char sexo){
        this.sexo = sexo;
    }
    void setRg(RG rg){
        this.rg = rg;
    }

        public abstract void falar (String fala);
        public abstract void mostrarDados();



}
