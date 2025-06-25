import java.util.Scanner;
public class Main {
    /*
     * A entrada é composta por vários casos de teste (partidas). Cada caso é iniciado com um inteiro N (de 0 até 10) representando o
     * número de rodadas da partida, sendo que o valor 0 representa o final da entrada e não deve ser processado. Cada uma das
     * próximas N linhas contém dois inteiros, A e B, onde A é o número escolhido pelo primeiro jogador e B é o número escolhido pelo
     * segundo jogador (0 ≤ A, B ≤ 10).
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int jogada;

        while ((jogada = sc.nextInt()) != 0){
            int ladoEsquerdo = 0;
            int ladoDireito = 0;

            for (int i = 1 ; i <= jogada; i++){
                System.out.println("n1 : ");
                int n1 = sc.nextInt();
                System.out.println("n2 : ");
                int n2 = sc.nextInt();
                if (n1 > n2){
                    ladoEsquerdo++;
                }else if (n1 < n2) {
                    ladoDireito++;
                }
            }
            System.out.println(ladoEsquerdo + " " + ladoDireito);
        }
        sc.close();
    }
}
