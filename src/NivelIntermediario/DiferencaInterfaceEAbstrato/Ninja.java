package NivelIntermediario.DiferencaInterfaceEAbstrato;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    public abstract void nomeDoNinja();

    public void tacarKunai(){
        System.out.println("Eu taquei uma Kunai");
    }
}
