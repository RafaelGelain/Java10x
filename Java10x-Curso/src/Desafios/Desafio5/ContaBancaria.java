package Desafios.Desafio5;

public abstract class ContaBancaria implements Conta {
    String nomeConta;
    int numeroConta;
    double saldo;
    TipoConta tipoConta;

    public ContaBancaria(String nomeConta, int numeroConta, double saldo) {
        this.nomeConta = nomeConta;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(String nomeConta, int numeroConta, double saldo, TipoConta tipoConta) {
        this(nomeConta,numeroConta,saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Nome do Cliente : "+nomeConta);
        System.out.println("Numero da Conta : "+numeroConta);
        System.out.println("Saldo : "+saldo);
    }

    @Override
    public abstract void depositar(double valor);

}
