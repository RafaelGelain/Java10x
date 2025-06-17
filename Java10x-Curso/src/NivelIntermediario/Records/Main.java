package NivelIntermediario.Records;

public class Main {
    public static void main(String[] args) {

    Ninja cadastro = new Ninja("Naruto", "Naruto@Gmail.com", 99999999);

    NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com", 1234);
    System.out.println(cadastroUsandoRecord);
    System.out.println(cadastroUsandoRecord.retornarEmail());


    }
}
