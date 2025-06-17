package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome e "+nome+", e esse e meu ataque uchiha, FIRE BALL");
    }

    public void estrategiaDeBatalha(){
        System.out.println("Essa e minha estrategia de batalha");
    };
}
