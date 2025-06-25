import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        Map<Integer, Integer> frequencias = new HashMap<>();

        for (Integer numero : numeros) {
            if (frequencias.containsKey(numero)) {
                frequencias.put(numero, frequencias.get(numero) + 1);
            } else {
                frequencias.put(numero, 1);
            }
        }

        List<Integer> numerosDistintos = new ArrayList<>(frequencias.keySet());
        Collections.sort(numerosDistintos);

        for (Integer numero : numerosDistintos) {
            System.out.println(numero + " aparece " + frequencias.get(numero) + " vez(es)");
        }
    }
}