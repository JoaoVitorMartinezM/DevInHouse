package br.com.devinhouse.exercicios.semana03;

public class Funcionario {
    String cpf, nomeCompleto;
    float salario;

    public Funcionario(String cpf, String nomeCompleto, float salario){
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.salario = salario;


    }

    public void promover(float porcentual){
        this.salario += this.salario * porcentual;
    }
}
