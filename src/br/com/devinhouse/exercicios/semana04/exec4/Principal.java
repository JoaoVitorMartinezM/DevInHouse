package br.com.devinhouse.exercicios.semana04.exec4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Boolean idadaEhValida = false;

        while(!idadaEhValida)
            try {
                System.out.print("Quantos anos você tem ? ");
                Scanner scan = new Scanner(System.in);
                int idade = scan.nextInt();
                System.out.println("Olá, você tem "+ idade +" anos de idade!"
                );
                idadaEhValida = true;

            }catch (Exception e){
                System.out.println("Entrada inválida");
            }
    }

}
