package NivelIntermediario.ArrayAndListAndStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ResumoDoQueFoiAprendido {
    public static void main(String[] args) {
        /*
         *  Arrays
         *  Sao Estaticos , Sempre precisa alocar a quantidade de memoria dentro do Array [?] <--
         *  Exigem um tamanho pre definido
         * */
        System.out.println("----------- ARRAY -----------");
        String[] nomeNinjaArray = new String[3];
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";

        System.out.println("vilaDaFolhaArray : "+nomeNinjaArray);

        for (int i = 0; i < nomeNinjaArray.length; i++) {
            System.out.println("Array "+i+" : "+nomeNinjaArray[i]);
        }

        /*
        *  Lista e um pouco mais lenta em comparacao com o ARRAY
        *  Listas Sao Dinamicas ,
        *  Aumentam e Diminium de tamanho conforme precisamos
        * */
        System.out.println("----------- LISTA -----------");
        List<String> nomeNinjaList = new ArrayList<>();
        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        System.out.println(nomeNinjaList);

        /*
         *  STACKS sao unicos
         *  Exigem uma ordem ! O ultimo a entrar e o primeiro a sair !
         * */
        System.out.println("----------- STACK -----------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
//        nomeNinjaStack.push("Kakashi Hatake");

        System.out.println("Mostrar Stack : "+nomeNinjaStack);
        System.out.println("Tirar da Stack : "+nomeNinjaStack.pop());
        System.out.println("Mostrar Stack : "+nomeNinjaStack);
        System.out.println("Tamanho da Stack : "+nomeNinjaStack.size());
    }
}
