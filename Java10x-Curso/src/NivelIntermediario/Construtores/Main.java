package NivelIntermediario.Construtores;

public class Main {
    public static void main(String[] args) {

        Senju Tobirama = new Senju("Tobirama Senju", 23, true);
        System.out.println(Tobirama.idade + " , "+Tobirama.vivoOuNao+" , "+Tobirama.nome);
        Tobirama.sabedoriaHokage();
    }
}
