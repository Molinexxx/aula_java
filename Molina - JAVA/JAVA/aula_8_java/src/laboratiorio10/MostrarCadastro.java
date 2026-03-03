package laboratiorio10;

public class MostrarCadastro {
    public static void main(String[] args) {
        Cadastro cast = new Cadastro();
        Cadastro cast2 = new Cadastro("pedro", "lima");
        Cadastro cast3 = new Cadastro("Ronaldo", "fenomeno", 34);

        cast.mostrar();
        cast2.mostrar();
        cast3.mostrar();



    }
}
