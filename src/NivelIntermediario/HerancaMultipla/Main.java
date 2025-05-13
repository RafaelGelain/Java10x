package NivelIntermediario.HerancaMultipla;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Vila da Folha", 17);
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Vila da Folha", 32);
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();
    }
}
