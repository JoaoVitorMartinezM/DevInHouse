package br.com.devinhouse.exercicios.exec5_a_10.cli;

import br.com.devinhouse.exercicios.exec5_a_10.model.Heroi;
import br.com.devinhouse.exercicios.exec5_a_10.model.Vilao;
import br.com.devinhouse.exercicios.exec5_a_10.repository.PersonagemRepository;

public class Display {
    public void exibeConteudo(){
        System.out.println("1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
    }

    public void cadastrarHeroi(String nome, String superPoder, String nomeVidaReal){

        Heroi heroi = new Heroi(nome, superPoder, nomeVidaReal);

        PersonagemRepository.Personagens.add(heroi);
        System.out.println(heroi);



    }

    public void cadastrarVilao(String nome, String superPoder, int tempoDePrisao){

        Vilao vilao = new Vilao(nome, superPoder, tempoDePrisao);
        PersonagemRepository.Personagens.add(vilao);
        System.out.println(vilao);

    }

    public void listarPersonagens(){
        for(int i = 0; i<PersonagemRepository.Personagens.size(); i++){
            System.out.println(PersonagemRepository.Personagens.get(i));

        }
    }


}
