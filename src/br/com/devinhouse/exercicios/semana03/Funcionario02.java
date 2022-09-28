package br.com.devinhouse.exercicios.semana03;

public class Funcionario02 {
    String nome;
    float salario;

    public Funcionario02(String nome){
        this.nome = nome;

    }

    public Funcionario02(String nome, float salario){
        this.nome = nome;
        this.salario = salario;


    }

    public void aumentar(float valor){
        this.salario += valor;
    }

    public void aumentar(float valor, float comissao){
        this.salario += valor + comissao;
    }
}