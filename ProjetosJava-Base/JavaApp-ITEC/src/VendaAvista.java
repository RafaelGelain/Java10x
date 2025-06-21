public class VendaAvista extends Venda{
    private double desconto;

    public VendaAvista(Integer codigo, String nomeProduto, double quantidade, double valorUnitario) {
        super(codigo, nomeProduto, quantidade, valorUnitario);
    }

    public VendaAvista(Integer codigo, String nomeProduto, double quantidade, double valorUnitario, double desconto) {
        super(codigo, nomeProduto, quantidade, valorUnitario);
        this.desconto = desconto;
    }

    @Override
    public double obterTotal() {
        return getQuantidade() * getValorUnitario() - desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        desconto = desconto;
    }
}
