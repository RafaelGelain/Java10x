package NivelBasico.Condicoes;

public class IFeElse {
    public static void main(String[] args) {

        /*
        * IF e Else - Condicoes
        *Objetivo : Passar o ninja de nivel usando o numero de missoes
        * */
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 11;

        if (numeroDeMissoes == 10 && idade >= 15) {
            System.out.println("Rank : Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank : Jounin");
        } else {
            System.out.println("Rank : Gennim");
        }
    }
}
