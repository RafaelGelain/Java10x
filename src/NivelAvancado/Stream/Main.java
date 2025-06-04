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

    //ORDENACAO por idade
    ninjaList.stream()
            .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
            .forEach(System.out::println)
    ;

    }
}
