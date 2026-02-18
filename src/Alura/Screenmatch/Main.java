package Alura.Screenmatch;

import br.com.alura.screenmatch.modelos.filme;
import br.com.alura.screenmatch.modelos.serie;
import br.com.alura.screenmatch.calculos.calcularodaDeTempo;

public class Main {
    static void main(String[] args) {

        filme filme1 = new filme();

        System.out.println("");
        filme1.setNome("The Matrix");
        filme1.setAnoDeLancamento(1958);
        filme1.setDuracaoEmMinutos(185);
        filme1.setIncluidoNoPlano(true);

        filme1.exibeFichaTecnica();

        System.out.println("");

        filme filme2 = new filme();

        filme2.setNome("TESTE");
        filme2.setAnoDeLancamento(2025);
        filme2.setDuracaoEmMinutos(182);
        filme2.setIncluidoNoPlano(true);
        filme2.exibeFichaTecnica();

        /*
         * filme1.avalia(9);
         * filme1.avalia(8);
         * filme1.avalia(9);
         * 
         * System.out.printf("Média de avaliações do Filme: %.2f", filme1.pegaMedia());
         * System.out.println(filme1.getSomaDasAvaliacoes());
         * System.out.println(filme1.getTotalDeAvaliacoes());
         */

        /*
         * serie serie1 = new serie();
         * serie1.setAnoDeLancamento(2020);
         * serie1.setNome("Teste");
         * serie1.setTemporadas(5);
         * serie1.setEpisodiosPorTemporada(8);
         * serie1.setMinutosPorEpisodio(26);
         * System.out.println(serie1.getDuracaoEmMinutos());
         * 
         */

        calcularodaDeTempo calculadora = new calcularodaDeTempo();
        System.out.println("");
        calculadora.inclui(filme1);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());

    }

}
