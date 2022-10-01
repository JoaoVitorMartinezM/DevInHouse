package br.com.devinhouse.exercicios.semana03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.*;

import javax.sound.sampled.SourceDataLine;

public class Principal {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Exec 01
        Funcionario joao = new Funcionario("10662222222", "Joao", 1000.0F);

        joao.promover(0.1F);

        System.out.println(joao.salario);

        // Exec 03
        Contador.contarPalavras("Testando método estático da classe 'Contador' que conta o número de palavras");

        // Exec 04
        Contador2 contador2 = new Contador2("Frase para o contador de palavras");
        contador2.contarPalavras();

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
                System.out.print(fatiamento[i] + " ");
                sorteados[n] = Integer.parseInt(fatiamento[i]);
                n++;

            }
            Concursos.add(new Concurso(Integer.parseInt(fatiamento[0]),data,sorteados));


        }
        System.out.println(Concursos.toString());

    }
}
