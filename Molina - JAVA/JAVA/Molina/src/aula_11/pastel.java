package aula_11;

public class pastel {
    public static void main(String[] args) {
        System.out.println("--simples");
    ReceitaPastel pastel = new ReceitaPastel("queijo");
    pastel.MostrarPastel();
        System.out.println();
        System.out.println("--completo");
    ReceitaPastel pastel2 = new ReceitaPastel("calabresa com quiejo" , "grande");
    pastel2.MostrarPastel();
        System.out.println();
    }
}
