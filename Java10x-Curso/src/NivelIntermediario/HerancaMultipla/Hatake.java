package NivelIntermediario.HerancaMultipla;

public class Hatake extends NInja implements SharinganInterface, AnbuInterface, HokageInterface{

    public Hatake(String nome, String vila, int idade) {
        super(nome, vila, idade);
    }

    public void boasVindas(){
        System.out.println(nome+": Eu sou um Hatake");
    }

    public void sharinganAtivado(){
        System.out.println(nome+": Ativou o Sharingan.");
    }

    public void ninjaDeElite(){
        System.out.println(nome+": Faz parte da Anbu");
    }

    public void hokageAtivo(){
        System.out.println(nome+": E o Hokage da "+vila);
    }
}
