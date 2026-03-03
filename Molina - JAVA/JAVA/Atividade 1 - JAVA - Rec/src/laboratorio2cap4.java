public class laboratorio2cap4 {
    public static void main(String[] args) {
        String mes = "fevereiro";
            switch (mes){
             case "janeiro":
             case "marco":
             case "maio":
             case "julho":
             case "agosto":
             case "outubro":
             case "dezembro":
                System.out.println("esse mes tem 31 dias");
                    break;
              case "fevereiro":
                System.out.println("esses mes 28 dias");
                    break;
              case "abril":
             case "junho":
             case "setembro":
              case "novembro":
                 System.out.println("esse mes tem 30 dias");
                    break;
              default:
                System.out.println("esse mes nao existe");
        }
    }
}
