package DesafiosV2.Contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        List<Contatos> contatosList = new ArrayList<Contatos>();
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("=== AGENDA DE CONTATOS ===");
            System.out.println("1 - Adicionar Contatos");
            System.out.println("2 - Remover Contatos");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Buscar Contatos");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma Opcao :");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o Nome : ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o Telefone :");
                    int telefone = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o Email :");
                    String email = sc.nextLine();
                    Contatos contatos = new Contatos(nome, email, telefone);
                    agenda.adicionarContato(contatos);
                    break;
                case 2:
                    System.out.println("Qual usuario voce quer excluir ?");
                    agenda.removerContato(sc.next());
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.println("Digite o nome do contato para pegar os dados");
                    String nome2 = sc.nextLine();
                    agenda.buscarContato(nome2);
            }
        }
    }
}
