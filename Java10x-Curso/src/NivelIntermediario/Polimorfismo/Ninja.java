package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha{
    //TODO: FAZER INCLUID NOVOS ATRIBUTOS: numeroDeMissoesConcluidas , rank
    //TODO: Rank : Gennin , Chunnin , Jounnin , Hokage
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    //TODO NINJA VAI FAZER OBRIGATORIAMENTE
    final void tacarKunai(){
        System.out.println("Eu sou um metodo da classe mae");
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos.
    //Sobrecarga de metodos , voce nao precisa redeclarar o construtor so os novos atributos.

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome e "+nome+", e esse e meu ataque especial.");
    }

    @Override
    public void estrategiaDeBatalha(){
        System.out.println("Essa e minha estrategia de batalha.");
    };
}
