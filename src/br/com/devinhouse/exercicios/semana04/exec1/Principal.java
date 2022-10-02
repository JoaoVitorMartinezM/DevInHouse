package br.com.devinhouse.exercicios.semana04.exec1;

public class Principal {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(100);

        contaCorrente.sacar(20);

        System.out.println(contaCorrente.ObterSaldoAtual());



    }
}
