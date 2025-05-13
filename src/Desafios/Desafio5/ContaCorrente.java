package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{
    public ContaCorrente(String nomeConta, int numeroConta, double saldo) {
        super(nomeConta, numeroConta, saldo);
    }

    public ContaCorrente(String nomeConta, int numeroConta, double saldo, TipoConta tipoConta) {
        super(nomeConta, numeroConta, saldo, tipoConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
        }else {
            System.out.println("Valor insuficiente para realizar o deposito.");
        }
    }
}
