public class att3b {
    public static void main (String[] args){
        att3a att = new att3a();
        att3c att2 = new att3c();

        att.modelo = "sportline";
        att.ano = 2020;
        att.marca = "gol";

        att2.pai = "ronaldo";
        att2.ano = "carro de marca ";
        att2.alegria = " Agradeco a meu pai";


        System.out.println("meu pai " + att2.pai + " quis me dar de presente um "+ att2.ano + att.marca +
                " de modelo "  + att.modelo + " do ano de " + att.ano + att2.alegria);
    }
}
