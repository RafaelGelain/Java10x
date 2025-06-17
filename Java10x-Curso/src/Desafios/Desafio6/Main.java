package Desafios.Desafio6;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> ninjaLinkedList = new LinkedList<>();
        ninjaLinkedList.add(new Ninja("Naruto Uzuaki", 17, "Vila da Folha"));
        ninjaLinkedList.add(new Ninja("Sasuke Uchiha", 18, "Vila da Folha"));
        ninjaLinkedList.add(new Ninja("Sakura Haruno", 17, "Vila da Folha"));
        ninjaLinkedList.add(new Ninja("Madara Uchiha", 42, "Vila da Folha"));
        ninjaLinkedList.add(new Ninja("Gaara o Areioso", 16, "Vila da Areia"));
        ninjaLinkedList.add(new Ninja("Zabuza momochi o ninja do gas oculto", 38, "Vila do Som?"));
        ninjaLinkedList.add(new Ninja("Jiraya", 62, "Vila da Folha"));

        System.out.println("LISTA DE NINJAS : ");
        for (Ninja ninja : ninjaLinkedList){
            System.out.println(ninja);
        }
        //ADICIONAR O NINJA NO INICIO DA LISTA
        ninjaLinkedList.addFirst(new Ninja ("Boruto Uzumaki", 5 , "Vila da Folha"));

        //REMOVER O NINJA DO INICIO DA LISTA
        ninjaLinkedList.removeFirst();

        //MOSTRAR OS NINJAS
        System.out.println("LISTA DE NINJAS ATUALIZADA: ");
        for (Ninja ninja : ninjaLinkedList){
            System.out.println(ninja);
        }
        //PROCURAR NINJA POR INDICE
        Ninja terceiroNinja = ninjaLinkedList.get(2);
        System.out.println("Terceiro Ninja :"+terceiroNinja);
    }
}
