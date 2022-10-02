package br.com.devinhouse.exercicios.semana04.exec1;

public class ContaCorrente extends Conta implements Operavel{
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;

    }

    @Override
    public void sacar(double valor) {
        super.saldo -= valor;

    }


    @Override
    protected double ObterSaldoAtual() {
        return super.ObterSaldoAtual();
    }
}
