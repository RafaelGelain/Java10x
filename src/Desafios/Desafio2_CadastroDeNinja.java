package Desafios;

import java.util.Scanner;
public class Desafio2_CadastroDeNinja {

    public static void main(String[] args) {
        /*  Desafio 2 -  Você foi encarregado pelo Hokage para gerenciar o
            cadastro de ninjas na Vila da Folha. Sua missão é criar
            um sistema simples em Java para cadastrar novos
            ninjas e listar todos os ninjas cadastrados.
        * */
        Scanner sc = new Scanner(System.in);
        String[] nomeNinja = new String[5];
        int cadastro = 0;
        int opcao = 0;

        while (opcao != 3){
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = sc.nextInt();
        System.out.println();

        switch (opcao){
            case 1:
                System.out.println("== Cadastro ==");
                System.out.println("Digite o nome do novo Ninja: ");
                sc.nextLine();
                nomeNinja[cadastro] = sc.nextLine();
                cadastro++;
                break;

            case 2:
                System.out.println("== Listando Ninjas ==");
                    for (int i = 0; i < 5; i++) {
                        System.out.println(nomeNinja[i]);
                    }
                break;

            case 3:
                System.out.println("Saindo ...");
                break;
            default:
                System.out.println("Escolher um numero entre 1 a 3.");
                break;

            }
        }
    }
}
