package mod9;

public class Cap9_Lab1 {
    public static void main(String[] args) {
        Pessoa rafa = new aluno("Rafael", 19, 'M', 23423000, "03/10/2006", 2300, "C#"  );
        Pessoa  marcela = new aluno("Marcela", 23, 'F', 23123123, "03/12/2001", 2300, "C#"  );
        Pessoa Pr = new Professor("Manuel", 49, 'm',  2113131554 ,"03/02/1989",  4500, "Matematica" );


        System.out.println("manuel : rafael?");
        System.out.println("rafael : Presente");
        System.out.println("manuel : marcela ");
        System.out.println("marcela : Presente");

        rafa.falar("Aluno");
        rafa.mostrarDados();
        marcela.falar("aluna");
        marcela.mostrarDados();
        Pr.falar("Professor");
        Pr.mostrarDados();



    }

}
