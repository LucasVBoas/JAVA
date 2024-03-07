public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Criar um objeto para representar um cachorro
        Cachorro huskySiberiano = new Cachorro();
        //Atribuir valores ao atributos do objeto
        huskySiberiano.nome = "Max";
        huskySiberiano.peso = 34;
        huskySiberiano.idade = 9;
        huskySiberiano.castrado = true;

        //Exibir os dados do objeto do cachorro
        System.out.println(huskySiberiano.nome + " tem  "  + huskySiberiano.idade + " anos," +
                " pesa " + huskySiberiano.peso + " Kg e é castrado? " + huskySiberiano.castrado);

        //Criar um outro objeto cachorro
        Cachorro goldenRetrivier = new Cachorro();
        //Atribuir outros valores
        goldenRetrivier.nome = "Truco";
        goldenRetrivier.peso = 28;
        goldenRetrivier.idade = 1;
        goldenRetrivier.castrado = false;
        //Exibir os valores do outro objeto
        System.out.println(goldenRetrivier.nome + " tem  "  + goldenRetrivier.idade + " anos," +
                " pesa " + goldenRetrivier.peso + " Kg e é castrado? " + goldenRetrivier.castrado);

        //Chamar os métodos
        huskySiberiano.andar();
        goldenRetrivier.andar();
    }
}