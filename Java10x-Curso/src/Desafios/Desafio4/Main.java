package Desafios.Desafio4;

public class Main {
    public static void main(String[] args) {

        /*
        * Desafio 4 - BatismoJava
        * */
        System.out.println();
        NinjaBasico nBasico = new NinjaBasico("Ninja Aleatorio Random", 30, TipoHabilidade.NINJUTSU);
        nBasico.mostrarInformacoes();
        nBasico.executarHabilidade();
        System.out.println();
        NinjaAvancado nAvancado = new NinjaAvancado("Naruto Uzumaki", 17, TipoHabilidade.GENJUTSU, "Dar Pohada com a Kyubi em newbas");
        nAvancado.mostrarInformacoes();
        nAvancado.executarHabilidade();
    }
}
