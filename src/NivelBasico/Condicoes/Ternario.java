package NivelBasico.Condicoes;

public class Ternario {
    public static void main(String[] args) {
        /*
        * Ternarios : Maneiras de reduzir o codigo.
        * variavel = ( condicoes ) ? valorVerdadeiro : ValorSeFalso
        * */

        short numeroMissoes = 11;

        String nivel = (numeroMissoes >= 10) ? "Esse Ninja esta com mais de 10 Missoes":"Esse ninja tem menos de 10 missoes";
        System.out.println(nivel);
    }
}
