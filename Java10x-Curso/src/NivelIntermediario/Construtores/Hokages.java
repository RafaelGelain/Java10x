package NivelIntermediario.Construtores;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public abstract void sabedoriaHokage();

    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
