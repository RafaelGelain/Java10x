package NivelIntermediario.Construtores;

public class Senju extends Hokages{
    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    @Override
    public void sabedoriaHokage() {
        System.out.println("Voce ganhou Sabedoria.");
    }
}
