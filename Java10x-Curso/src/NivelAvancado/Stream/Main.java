package NivelAvancado.Stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjaList = new ArrayList<>();
        ninjaList.add(new Ninja("Naruto Uzumaki", "Konoha", 16));
        ninjaList.add(new Ninja("Sakura Uchiha", "Konoha", 17));
        ninjaList.add(new Ninja("Sakura Haruno", "Konoha", 15));
        ninjaList.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjaList.add(new Ninja("Gaara", "Suna", 18));
        ninjaList.add(new Ninja("Temari", "Suna", 19));
        ninjaList.add(new Ninja("Rock Lee", "Konoha", 17));

        // STREAMS
        // FILTRAGEM POR VILA
/*    ninjaList.stream()
            .filter(ninja -> ninja.getVila().equals("Konoha"))
            .forEach(System.out::println) //soutc
    ;*/
/*
    //FILTER ORDENACAO por idade
    ninjaList.stream()
            .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
            .forEach(System.out::println)
    ;*/

        //SORTED - ORDENACAO ALFABETICA
/*
        ninjaList.stream()
                .sorted((o1, o2) -> o1.getNome().compareTo(o2.getNome()))
                .forEach(System.out::println);

        //MAP - MOSTRAR E MAPEAR UM ATRIBUTO
        ninjaList.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);
*/


        //MAX - Filtrar por ninja mais velho
/*        Ninja NinjaMaisVelho = ninjaList.stream()
                .max((o1, o2) -> Integer.compare(o1.getIdade(), o2.getIdade()))
                .orElse(null);

        System.out.println("teste = " + NinjaMaisVelho);*/

    }
}
