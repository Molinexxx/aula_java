package herancaEInterface.heranca.ex3;

public class Pessoa {
    String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.nome);
    }

}
