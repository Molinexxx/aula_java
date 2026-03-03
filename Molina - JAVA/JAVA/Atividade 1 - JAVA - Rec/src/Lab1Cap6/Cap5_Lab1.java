package Lab1Cap6;

public class Cap5_Lab1 {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();

        func.nome = "pedro";
        func.sobrenome = "Rodrigues";
        func.cargo = "devLops";
        func.salario = 1200;

        System.out.println("Nome: " + func.nome);
        System.out.println("Sobrenome: " + func.sobrenome);
        System.out.println("Cargo: " + func.cargo);
        System.out.println("Salario: " + func.salario);
    }
}
