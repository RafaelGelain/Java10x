import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Venda> vendaLista = new ArrayList<>();

        VendaAvista venda1 = new VendaAvista(1 , "TESTE", 2, 5);
        VendaAvista venda2 = new VendaAvista(2 , "TESTE2", 3, 6);

        VendaAprazo venda3 = new VendaAprazo(3, "Teste3", 6, 50);
        vendaLista.add(venda1);
        vendaLista.add(venda2);
        vendaLista.add(venda3);

        vendaLista.stream().forEach(venda -> {
            System.out.println("Produto: " + venda.getNomeProduto());
            System.out.println("Quantidade: " + venda.getQuantidade());
            System.out.println("Valor Unitário: R$ " + venda.getValorUnitario());
            System.out.println("Total: R$ " + venda.obterTotal());
            System.out.println("----------------------------");
        });




    }
}