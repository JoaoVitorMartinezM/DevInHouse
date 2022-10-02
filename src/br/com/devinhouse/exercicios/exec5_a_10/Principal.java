package br.com.devinhouse.exercicios.exec5_a_10;

import br.com.devinhouse.exercicios.exec5_a_10.cli.Display;
import br.com.devinhouse.exercicios.exec5_a_10.exception.OpcaoInvalidaException;
import br.com.devinhouse.exercicios.exec5_a_10.model.Heroi;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String opcao = null;

        while (opcao == null || !opcao.equals("4")){
            Display display = new Display();
            Scanner scan = new Scanner(System.in);
            display.exibeConteudo();
            opcao = scan.nextLine();

            switch (opcao){
                case "1":
                    Scanner scan2 = new Scanner(System.in);
                    String nome = scan2.nextLine();
                    String superPoder = scan2.nextLine();
                    String nomeVidaReal = scan2.nextLine();
                    display.cadastrarHeroi(nome, superPoder, nomeVidaReal);

                    break;
                case "2":
                    Scanner scan3 = new Scanner(System.in);
                    nome = scan3.nextLine();
                    superPoder = scan3.nextLine();
                    int tempoDePrisao = scan3.nextInt();
                    display.cadastrarVilao(nome, superPoder, tempoDePrisao);
                    break;
                case "3":
                    display.listarPersonagens();
                    break;
                case "4":
                    System.out.println("Saiu do programa");
                    break;
                default:
                    try {
                        throw new OpcaoInvalidaException();

                    }catch (OpcaoInvalidaException e){
                        System.out.println("Você digitou uma opção inválida, vamos tentar novamente...");
                    }
                    break;
            }

            Heroi heroi1  = new Heroi("Homem Aran", "Teia", "Petter");
            Heroi heroi2  = new Heroi("Homem Aranha", "Escala Parede", "Petter PArker");


            System.out.println(heroi1.equals(heroi2));

            System.out.println(heroi1.compareTo(heroi2));



        }

    }
}
