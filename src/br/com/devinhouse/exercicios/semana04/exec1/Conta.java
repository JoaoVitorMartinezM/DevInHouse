package br.com.devinhouse.exercicios.semana04.exec1;

public abstract class Conta {
    protected double saldo;


    public Conta(double saldo) {
        this.saldo = saldo;
    }

    protected double ObterSaldoAtual() {
        return this.saldo;
    }
}
