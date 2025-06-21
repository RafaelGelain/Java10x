public class VendaAprazo extends Venda{
    private Integer quantidadeParcelas;

    public double obterValorParcela(){
        return (getValorUnitario() * getQuantidade()) / getQuantidadeParcelas();
    }

    public VendaAprazo(Integer codigo, String nomeProduto, double quantidade, double valorUnitario) {
        super(codigo, nomeProduto, quantidade, valorUnitario);
    }

    public VendaAprazo(Integer codigo, String nomeProduto, double quantidade, double valorUnitario, Integer quantidadeParcelas) {
        super(codigo, nomeProduto, quantidade, valorUnitario);
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }
}
