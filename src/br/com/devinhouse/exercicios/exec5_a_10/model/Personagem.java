package br.com.devinhouse.exercicios.exec5_a_10.model;

import java.util.Objects;

public abstract class Personagem implements Comparable {
    protected String nome;
    protected String superPoder;

    public Personagem(String nome, String superPoder) {
        this.nome = nome;
        this.superPoder = superPoder;
    }

    @Override
    public int compareTo(Object o) {

        return this.nome.compareTo(((Personagem) o).getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personagem that)) return false;
        return getNome().equals(that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }

    public String getNome() {
        return nome;
    }

    public String getSuperPoder() {
        return superPoder;
    }
}
