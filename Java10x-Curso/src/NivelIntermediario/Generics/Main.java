package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(5));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Pergaminho Teste"));

        bolsaNinja.mostrarFerramenta();

    }
}
