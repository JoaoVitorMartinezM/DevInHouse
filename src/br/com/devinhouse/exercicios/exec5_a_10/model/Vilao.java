package br.com.devinhouse.exercicios.exec5_a_10.model;

public class Vilao extends Personagem{
    private Integer tempoDePrisao;

    public Vilao(String nome, String superPoder, int tempoDePrisao) {
        super(nome, superPoder);
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return "Vilao{" +
                "tempoDePrisao=" + tempoDePrisao +
                ", nome='" + nome + '\'' +
                ", superPoder='" + superPoder + '\'' +
                '}';
    }

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

}
