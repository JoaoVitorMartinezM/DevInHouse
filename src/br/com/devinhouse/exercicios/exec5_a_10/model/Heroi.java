package br.com.devinhouse.exercicios.exec5_a_10.model;

public class Heroi extends Personagem{
    private String nomeVidaReal;


    public Heroi(String nome, String superPoder, String nomeVidaReal) {
        super(nome, superPoder);
        this.nomeVidaReal = nomeVidaReal;
    }

    @Override
    public String toString() {
        return "Heroi{" +
                "nomeVidaReal='" + nomeVidaReal + '\'' +
                ", nome='" + nome + '\'' +
                ", superPoder='" + superPoder + '\'' +
                '}';
    }

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }
}
