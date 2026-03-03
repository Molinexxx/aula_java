public class Cap5_Lab1 {
    public static void main(String[] args) {
        Funcionario fun = new Funcionario();

        fun.name = "Ronaldo ";
        fun.LastName = "Fenomeno ";
        fun.cargo = "dev";
        fun.salario = 3010;

        System.out.println("Nome: " + fun.name);
        System.out.println("Sobrenome: " + fun.LastName);
        System.out.println("Cargo: " + fun.cargo);
        System.out.println("Salario: R$" + fun.salario);



    }
}
