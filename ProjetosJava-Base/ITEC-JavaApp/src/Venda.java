public class Venda {
    private Integer codigo;
    private String nomeProduto;
    private double quantidade;
    private double valorUnitario;

    public double obterTotal(){
        return getQuantidade() * getValorUnitario();
    }

    public Venda(Integer codigo, String nomeProduto, double quantidade, double valorUnitario) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        setQuantidade(quantidade);
        setValorUnitario(valorUnitario);
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        if (quantidade <= 0){
            throw new IllegalArgumentException("A quantidade deve ser maior que 0 !");
        }
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        if (valorUnitario <= 0){
            throw new IllegalArgumentException("O valor deve ser maior que 0 !");
        }
        this.valorUnitario = valorUnitario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
}
