package Desafios.Desafio3;

public class Uchiha extends Ninja{
    String habilidadeEspecial;


    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial : " + habilidadeEspecial);
    }
    @Override
    public void mostrarInformacoes(){
        System.out.println("Nome : "+nome
                +", Idade : "+idade
                +", Missao Atual : "+missao
                +", Nivel de Dificuldade :"+nivelDificuldade
                +", Status da Missao : "+statusMissao
                +", Habilidade Especial : "+habilidadeEspecial);
    }
}
