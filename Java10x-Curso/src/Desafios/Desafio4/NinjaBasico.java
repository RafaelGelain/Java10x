package Desafios.Desafio4;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    TipoHabilidade TipoHabilidade;

    public NinjaBasico(String nome, int idade, TipoHabilidade TipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.TipoHabilidade = TipoHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Sou o Ninja " + nome + ", tenho "+idade+" anos, e minha habilidade e  "+TipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade e "+TipoHabilidade+" e utilizo dela para espancar os random do anime");
    }
}
