package NivelIntermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        * ARRAY NORMAL //
        * Sao Estaticos , Nao alteram de tamanho [ 3 ] sempre definindo a quantidade de tamanho. 
        * */
        String[] nomeArray = new String[3];
        nomeArray[0] = "TESTE1";
        nomeArray[1] = "TESTE2";
        nomeArray[2] = "TESTE2";

        for (int i = 0; i < nomeArray.length; i++) {
            System.out.println(nomeArray[i]);
        }
        System.out.println("-------");
        
        /*
        *  Aprendendo List
        *  Nao sao Estaticas , elas podem aumentar e diminuir conforme a demanda
        * */

        //ADICIONAR ELEMENTOS NA LISTA
        List<String> nomeList = new ArrayList<>();
        nomeList.add("Naruto Uzumaki");
        nomeList.add("Sakura Haruno");
        nomeList.add("Sasuke Uchiha");
        nomeList.add("Boruto Uzumaki");
        System.out.println("nomeList = " + nomeList);

        //REMOVER ITEM DA LISTA
        nomeList.remove("Boruto Uzumaki");
        System.out.println("nomeList = " + nomeList);

        //TROCAR ELEMENTOS
        nomeList.set(2, "Itachi Uchiha");
        System.out.println("nomeList = " + nomeList);

        //VER TAMANHO DA LISTA
        System.out.println("nomeList = " + nomeList.size());

    }
}
