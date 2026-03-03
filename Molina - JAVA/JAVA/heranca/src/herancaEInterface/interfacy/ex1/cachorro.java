package herancaEInterface.interfacy.ex1;

public class cachorro implements Animal {
    @Override
    public void fazerSom() {
        System.out.println("au au");
    }

    public static void main(String[] args) {
        Animal al = new cachorro();

        al.fazerSom();
    }

}
