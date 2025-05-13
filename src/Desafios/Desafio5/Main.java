package Desafios.Desafio5;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("Sasuke Agiota", 123, 150.0, TipoConta.CORRENTE);
        conta.consultarSaldo();
        conta.depositar(100);
        conta.consultarSaldo();

        System.out.println();
        System.out.println("------");
        System.out.println();

        ContaPoupanca naruto = new ContaPoupanca("Naruto Uzumaki", 1234, 150, TipoConta.POUPANCA);
        naruto.consultarSaldo();
        naruto.depositar(100);
        naruto.consultarSaldo();

    }
}
