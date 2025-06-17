package DesafiosV2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        String resposta = "s";

        System.out.println("}-- Calculadora Simples --{");
        while (resposta.equalsIgnoreCase("s")){
            System.out.print("Digite o primeiro numero : ");
            int n1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Selecione o operador da operacao ( +, - , *, /)");
            char op = sc.nextLine().charAt(0);
            System.out.print("Digite o segundo numero : ");
            int n2 = sc.nextInt();
            switch (op){
                case '+':
                    System.out.println("resultado : "+(n1+n2));
                break;
                case '-':
                    System.out.println("resultado : "+(n1-n2));
                break;
                case '*':
                    System.out.println("resultado : "+(n1*n2));
                break;
                case '/':
                    System.out.println("resultado : "+(n1/n2));
                break;
            }
            System.out.println("Deseja continuar ? ( S / N )");
            resposta = sc.next();
        }
    }
}
