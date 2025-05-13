package NivelIntermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Array
        //Sao Estaticos e tem Referencia de memoria previa.
        String[] ninjaArray = new String[4];
        ninjaArray[0] = "TESTE1";

        //Lista
        //Sao dinamicas e tamanho aumento e diminui conforme precisa.
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("TESTE LISTA");

        //Stack
        //o ultimo elemento que entrou e obrigatoriamente a sair.
        //todo: funciona como historico de navegar , o ultimo elemento a acessar vai para o topo da lista , assim como um historico de navegador.
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.add("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Hinata Huyga");
        ninjaStack.push("Kakashi Hatake");
        ninjaStack.push("Sakura Haruno");

        System.out.println("Minha Stack Atual : "+ ninjaStack);
        ninjaStack.pop();
        System.out.println("Minha Stack Atualizada com Pop : "+ ninjaStack);
        System.out.println("Minha Stack Atualizada com Peek : "+ ninjaStack.peek());
        System.out.println("Minha Stack Atualizada com Size : "+ ninjaStack.size()+" elementos");
    }
}
