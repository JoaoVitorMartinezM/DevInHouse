package br.com.devinhouse.exercicios.semana03;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class Principal {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, NumberFormatException {
        // Exec 01
//         Funcionario joao = new Funcionario("10662222222", "Joao", 1000.0F);

//         joao.promover(0.1F);

//         System.out.println(joao.salario);

//         // Exec 03
//         Contador.contarPalavras("Testando método estático da classe 'Contador' que conta o número de palavras");

//         // Exec 04
//         Contador2 contador2 = new Contador2("Frase para o contador de palavras");
//         contador2.contarPalavras();

        // Exec 05
        final Path PathArquivo = Paths.get("src/br/com/devinhouse/exercicios/semana03/megasena.txt");
        List<String> lista = Files.readAllLines(PathArquivo);
        List<Concurso> Concursos = new ArrayList<Concurso>();
        int[] sorteados = new int[6];

        for (String linha : lista) {
            String[] fatiamento = linha.split(",");
            DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(fatiamento[1], formatar);

            int n = 0;
            for (int i = 2; i < fatiamento.length; i++) {
                sorteados[n] = Integer.parseInt(fatiamento[i]);
                n++;

            }
            // Exec06 -> Apenas ordenando a lista antes de instanciar o objeto.
            Arrays.sort(sorteados);

            Concursos.add(new Concurso(Integer.parseInt(fatiamento[0]), data, sorteados));

        }
       
        List<String> lista2 = new ArrayList<String>();

        System.out.println(Concursos.toString());

        //Exec08
        String search = JOptionPane.showInputDialog("Digite uma data (Ano-Mês-Dia) para realizar a busca nos sorteios da Megasena: ");
        Boolean match = false;
        for (int i = 0; i < Concursos.size(); i++) {
        match = Concursos.get(i).getData().toString().equalsIgnoreCase(search);
        if (match) {
        System.out.println(Concursos.get(i) + " Acheiii");
        break;

        }
        }
        if (!match) {
        System.out.println("Não houve sorteio na data pesquisada.");
        }

        
        //Exec09
        String kick = JOptionPane.showInputDialog("Digite seu chute de 6 numeros separados por espaço (1 2 3 4 5 6): ");
        String[] NumerosUsuario = kick.split(" ");
        int[] NumerosUsuarioConvertido = new int[6];

        int k = 0;
        for (int i = 0; i < NumerosUsuario.length; i++) {
            NumerosUsuarioConvertido[k] = Integer.parseInt(NumerosUsuario[i]);
            System.out.println(NumerosUsuarioConvertido.length);
            k++;

        }

        Arrays.sort(NumerosUsuarioConvertido);

        for (int i = 0; i < Concursos.size(); i++) {
            match = Arrays.equals(Concursos.get(i).getSorteados(), NumerosUsuarioConvertido);

            if (match) {
                System.out.println(Concursos.get(i) + " Acheiii");
                break;

            }
        }
        if (!match) {
            System.out.println("Esta sequência de números ainda não foi sorteada");
        }

        // Exercicio 10
    
        // criando e populando Map de nros sorteados e respectivas quantidade em que foram sorteados
        Map<Integer, Integer> map = new HashMap<>();
        for (Concurso concurso: Concursos) {
            for (int i = 0; i < sorteados.length; i++) {
                int nro = sorteados[i];
                int qtdAtual = map.getOrDefault(nro, 0);
                map.put(nro, qtdAtual + 1);
            }
        }
        // calculado as maiores e menores quantidades
        int nroMaisFrequente = 1;
        int nroMenosFrequente = 1;
        int qtdMaisFrequente = 0;
        int qtdMenosFrequente = Integer.MAX_VALUE;

        for(Integer nro: map.keySet()) {
            Integer qtd = map.get(nro);
            if (qtd > qtdMaisFrequente) {
                qtdMaisFrequente = qtd;
                nroMaisFrequente = nro;
            }
            if (qtd < qtdMenosFrequente) {
                qtdMenosFrequente = qtd;
                nroMenosFrequente = nro;
            }
        

       
    }
    System.out.println("Número mais frequente = " + nroMaisFrequente);
    System.out.println("Número menos frequente = " + nroMenosFrequente);

    // Exercicio 11 - nro mais atrasado - mais tempo ser ter sido sorteado
    
        // criando e populando map de nros sorteados e respectivas ultima data em que foram sorteados (data mais recente de sorteio)
        Map<Integer, LocalDate> maps = new HashMap<>();
        for (Concurso concurso: Concursos) {
            for (int i = 0; i < sorteados.length; i++) {
                int nro = sorteados[i];
                if (map.containsKey(nro)) {
                    
                    LocalDate dataUltSorteio = maps.get(nro);
                    if (concurso.getData().isAfter(dataUltSorteio)) {
                        maps.put(nro, concurso.getData());
                    }
                } else {
                    maps.put(nro, concurso.getData());
                }
            }
        

        LocalDate dataMaisAntiga = LocalDate.now();
        int nroMaisAtrasado = 0;
        for(Integer nro: map.keySet()) {
            LocalDate data = maps.get(nro);
            if (data.isBefore(dataMaisAntiga)) {
                dataMaisAntiga = data;
                nroMaisAtrasado = nro;
            }
        }
        System.out.println("Mais atrasado: " + nroMaisAtrasado);
           
    }

    // Exec 07
    // Collections.sort(Concursos);
    // for(Concurso concurso: Concursos){
    //     System.out.println(concurso);
    // }
    

    }

}
