package DesafiosV2.Concessionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Concessionaria concessionaria = new Concessionaria();
        int opcao = 0;

        while (opcao != 4){
            System.out.println("--- CONCESSIONARIA ---");
            System.out.println("Escolha uma opcao :");
            System.out.println("1 - Mostrar Carros :");
            System.out.println("2 - Adicionar novo Carro :");
            System.out.println("3 - Deletar Carro :");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    concessionaria.mostrarCarro();
                    break;
                case 2:
                    System.out.println("Digite o Modelo do carro :");
                    sc.nextLine();
                    String modelo = sc.nextLine();
                    System.out.println("Digite a Marca do carro :");
                    String marca = sc.nextLine();
                    System.out.println("Digite o Cor do carro: ");
                    String cor = sc.nextLine();
                    System.out.println("Digite o Ano do carro: ");
                    int ano = sc.nextInt();
                    System.out.println("Digite o Valor : ");
                    int valor = sc.nextInt();
                    Carro carro = new Carro(modelo , marca , cor , ano , valor);
                    concessionaria.adicionarCarro(carro);
                    System.out.println("Adicionado com sucesso ...");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Digite a marca do carro: ");
                    concessionaria.removeCarro(sc.next());
                    break;
                case 4:
                    break;
            }
        }
    }
}
