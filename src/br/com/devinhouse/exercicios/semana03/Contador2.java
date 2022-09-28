package br.com.devinhouse.exercicios.semana03;

public class Contador2 {
    private String frase;

    public Contador2(String frase) {
        this.frase = frase;
    }

    public  void contarPalavras(){
        String[] palavras = this.frase.split(" ");
        System.out.println(palavras.length);
    }
}
