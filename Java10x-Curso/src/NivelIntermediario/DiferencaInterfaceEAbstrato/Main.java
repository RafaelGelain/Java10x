package NivelIntermediario.DiferencaInterfaceEAbstrato;

public class Main {
    public static void main(String[] args) {
        Uzumaki ninja = new Uzumaki();
/*      ninja.nome = "Naruto Uzumaki";*/
        ninja.tacarShuriken();


        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.nomeDoNinja();
        sasuke.tacarKunai();

    }
}
