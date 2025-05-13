package NivelIntermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- NARUTO ---");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 17, 14 , 1.80);
        System.out.println(naruto.getNome());
        naruto.setNome("");
        System.out.println(naruto.getNome());

        System.out.println("--- SASUKE ---");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 15 , 1.82);
        System.out.println(sasuke.getNome());
    }
}
