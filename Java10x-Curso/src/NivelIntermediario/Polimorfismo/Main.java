package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Folha";
        naruto.idade = 17;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        naruto.tacarKunai();
        System.out.println();
        System.out.println();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Folha";
        sasuke.idade = 18;
        sasuke.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        System.out.println();
        System.out.println();

        //UCHIHA 2
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45, 3, NivelNinja.HOKAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalha();
        System.out.println();
        System.out.println();
    }
}
