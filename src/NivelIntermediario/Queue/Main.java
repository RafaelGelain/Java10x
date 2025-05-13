package NivelIntermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        //QUEUE / FILA
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        //Mostrar a Fila
        System.out.println("Ninja da Fila : "+ninjasQueue);

        //Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninja da Fila depois do poll : "+ninjasQueue);

        //Como ver quem e o primeiro da fila
        System.out.println("Ninja Primeiro da Fila (HEAD) : "+ninjasQueue.peek());

        // Nao da para deletar o Tail ( Ultimo da fila )
    }
}
