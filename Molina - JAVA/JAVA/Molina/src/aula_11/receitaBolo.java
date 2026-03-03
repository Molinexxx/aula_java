package aula_11;

public class receitaBolo {
        private String Cobertura;
        private String sabor;
        private double preco;
        private String peso;
        private String frutas;

        //criando contrutor simples
        public receitaBolo(String cobertura, String sabor){
            this.Cobertura = cobertura;
            this.sabor = sabor;
            this.preco = 13.99;
            this.peso = "1kg";
            this.frutas = "sem frutas";
        }

        //construtor completo
        public receitaBolo(String cobertura, String sabor, double preco, String peso, String frutas){
            this.Cobertura = cobertura;
            this.sabor = sabor;
            this.preco = preco;
            this.peso = peso;
            this.frutas = frutas;

        }
        public void MostrarBolo(){
            System.out.println("cobertura: " + Cobertura);
            System.out.println("Sabor: " + sabor);
            System.out.println("preco: " + preco);
            System.out.println("peso: " + peso);
            System.out.println("Frutas: " + frutas);
        }
}
