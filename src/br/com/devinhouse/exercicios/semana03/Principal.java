package br.com.devinhouse.exercicios.semana03;

import java.time.LocalDate;
import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Exec 01
        Funcionario joao = new Funcionario("10662222222", "Joao", 1000.0F);

        joao.promover(0.1F);

        System.out.println(joao.salario);

        //Exec 03
        Contador.contarPalavras("Testando método estático da classe 'Contador' que conta o número de palavras");

        // Exec 04
        Contador2 contador2 = new Contador2("Frase para o contador de palavras");
        contador2.contarPalavras();

        // Exec 05



    }
}
