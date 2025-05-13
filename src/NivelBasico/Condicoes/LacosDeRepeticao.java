package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Lacos de Repeticoes : Repetem infinitamente ate atingir o parametro desejado.
        * While / For
        * */

//        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;
//        while (numeroDeClones <= numeroMaximoDeClones){
//            numeroDeClones++;
//            System.out.println("o Naruto fez um clone das sombras " + numeroDeClones);
//        }
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("o Naruto fez um clone das sombras " + i);
        }

    }
}
