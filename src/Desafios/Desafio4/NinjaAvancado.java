package Desafios.Desafio4;

public class NinjaAvancado implements Ninja {
    String nome;
    int idade;
    TipoHabilidade TipoHabilidade;
    String especialidade;

    public NinjaAvancado(String nome, int idade, TipoHabilidade TipoHabilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.TipoHabilidade = TipoHabilidade;
        this.especialidade = especialidade;
    }
    @Override
    public void mostrarInformacoes() {
        System.out.println("Sou o Ninja " + nome + ", tenho "+idade+" anos, e minha habilidade e  "+TipoHabilidade+" e possuio especialidade em "+especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Minha habilidade e "+TipoHabilidade+" e utilizo dela para espancar os random do anime");
    }
}
