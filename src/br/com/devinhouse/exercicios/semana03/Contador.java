package br.com.devinhouse.exercicios.semana03;

public class Contador {
    public static void contarPalavras(String frase){
        String[] palavras = frase.split(" ");
        System.out.println(palavras.length);
    }
}
