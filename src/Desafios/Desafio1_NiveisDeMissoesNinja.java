package Desafios;

public class Desafio1_NiveisDeMissoesNinja {
    public static void main(String[] args) {
        //NINJA 1
        String nome = "Naruto Uzumaki";
        int idade = 16;
        String missao = "Solar o Sasuke";
        String statusDaMissao = "Em Andamento";
        char nivelDaMissao = 'S';

        if (idade < 15){
            if ( nivelDaMissao == 'D' || nivelDaMissao == 'C'){
                statusDaMissao = "Concluida";
            }
            else{
                statusDaMissao = "Nao Concluida";
            }
        }else {
            statusDaMissao = "Concluida";
        }

        System.out.println("-----------------------");
        System.out.println("Nome do Ninja : " + nome);
        System.out.println("Idade : " + idade);
        System.out.println("Missao Atual : " + missao);
        System.out.println("Nivel da Missao : " + nivelDaMissao);
        System.out.println("Status da Missao : " + statusDaMissao);
        System.out.println("-----------------------");

        //NINJA 2
        String nome1 = "Sasuke Uchiha";
        int idade1 = 13;
        String missao1 = "Tankar o Naruto";
        String statusDaMissao1 = "Em Andamento";
        char nivelDaMissao1 = 'A';

        if (idade1 < 15){
            if ( nivelDaMissao1 == 'D' || nivelDaMissao1 == 'C'){
                statusDaMissao1 = "Concluida";
            }
            else{
                statusDaMissao1 = "Nao Concluida";
            }
        }else {
            statusDaMissao1 = "Concluida";
        }

        System.out.println("-----------------------");
        System.out.println("Nome do Ninja : " + nome1);
        System.out.println("Idade : " + idade1);
        System.out.println("Missao Atual : " + missao1);
        System.out.println("Nivel da Missao : " + nivelDaMissao1);
        System.out.println("Status da Missao : " + statusDaMissao1);
        System.out.println("-----------------------");

        //NINJA 3
        String nome2 = "Sakura A Fraquinha";
        int idade2 = 14;
        String missao2 = "Curar o Madara";
        String statusDaMissao2 = "Complicado mas indo";
        char nivelDaMissao2 = 'D';

        if (idade2 < 15){
            if ( nivelDaMissao2 == 'D' || nivelDaMissao2 == 'C'){
                statusDaMissao2 = "Concluida";
            }
            else{
                statusDaMissao2 = "Nao Concluida";
            }
        }else {
            statusDaMissao2 = "Concluida";
        }

        System.out.println("-----------------------");
        System.out.println("Nome do Ninja : " + nome2);
        System.out.println("Idade : " + idade2);
        System.out.println("Missao Atual : " + missao2);
        System.out.println("Nivel da Missao : " + nivelDaMissao2);
        System.out.println("Status da Missao : " + statusDaMissao2);
        System.out.println("-----------------------");

    }
}
