package NivelBasico.Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        * SwitchCases: Gerar casos especificos
        * Objetivo : Pedir pro usuario escolher entre os Ninjas.
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um Personagem :");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolha = sc.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Usuario Escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Usuario Escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Usuario Escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Voce nao digitou uma resposta valida, tente novamente");
        }

        sc.close();
    }
}
