package laboratiorio10;

public class Cadastro {
    private String nome;
    private String sobrenome;
    private int idade;

    String getNome(){
        return this.nome;
    }
    void setNome(String nome){
        this.nome = nome;
    }
    String getSobrenome(){
        return this.sobrenome;
    }
    void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    int getIdade(){
        return this.idade;
    }
    void setIdade(int idade){
        this.idade = idade;
    }
    public Cadastro (){}

    public Cadastro (String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Cadastro(String nome, String sobrenome, int idade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }
    void mostrar(){
        System.out.println("Nome do ser: " + this.nome);
        System.out.println("Sobrenome do ser: " + this.sobrenome);
        System.out.println("idade do ser: " + this.idade);
        System.out.println();
    }

}
