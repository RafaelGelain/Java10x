package Desafios.Desafio3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * implemente um menu interativo utilizando a classe Scanner para
         * permitir ao usuário escolher entre diferentes opções, como exibir informações de todos os
         * ninjas, adicionar novos ninjas ou atualizar as habilidades especiais. Isso ajudará a praticar o
         * uso de entrada do usuário e controle de fluxo no programa
         * */
    Scanner sc = new Scanner(System.in);
    int quantiaMaximaDeNinja = 5;
    int quantiaNinjaCadastrado = 0;
    int opcao = 0;
    Uchiha[] ninjas = new Uchiha[quantiaMaximaDeNinja];


        while (opcao != 4){
            System.out.println();
            System.out.println("=== Menu ===");
            System.out.println("1 - Adicionar Ninja");
            System.out.println("2 - Listar todos ninja");
            System.out.println("3 - Atualizar o Poder Especial");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            System.out.println();
        switch (opcao){
            case 1:
                Uchiha ninja = new Uchiha();
                if (quantiaNinjaCadastrado < quantiaMaximaDeNinja){
                    System.out.println("Digite o nome : ");
                    sc.nextLine();
                    ninja.nome = sc.nextLine();
                    System.out.println("Digite a idade : ");
                    ninja.idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Missao atual : ");
                    ninja.missao = sc.nextLine();
                    System.out.println("Nivel de Dificuldade ( S , A , B , C OU D ) : ");
                    ninja.nivelDificuldade = sc.nextLine();
                    System.out.println("Status da Missao : ");
                    ninja.statusMissao = sc.nextLine();
                    System.out.println("Poder Especial : ");
                    ninja.habilidadeEspecial = sc.nextLine();
                    ninjas[quantiaNinjaCadastrado] = ninja;
                    quantiaNinjaCadastrado++;
                }else {
                    System.out.println("Quantia maxima de ninjas cheia");
                }
                break;
            case 2:
                System.out.println("Listando ninjas :");
                for (int i = 0; i < quantiaNinjaCadastrado; i++) {
                    ninjas[i].mostrarInformacoes();
                }
                break;
            case 3:
                System.out.println("Nome do ninja: ");
                sc.nextLine();
                String nomeDoNinja = sc.nextLine();
                for (int i = 0; i < quantiaMaximaDeNinja; i++) {
                    if (ninjas[i] == null) {
                        System.out.println("Nenhum ninja encontrado");
                        break;
                    }

                    if (ninjas[i].nome.toLowerCase().contains(nomeDoNinja.toLowerCase())) {
                        System.out.print("Habilidade especial: ");
                        ninjas[i].habilidadeEspecial = sc.nextLine();
                        System.out.println("\nHabilidade especial do ninja atualizada com sucesso!\n");
                    }
                }
                break;
            case 4:
                System.out.println("Saindo ...");
                break;
            default:
                System.out.println("Escolha a opcao entre 1 a 4.");
                break;
        }
    }
}}
