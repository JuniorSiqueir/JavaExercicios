package Alura.Screenmatch;

import br.com.alura.screenmatch.modelos.filme;
import br.com.alura.screenmatch.modelos.serie;

public class Main {
    static void main(String[] args) {

        /* 
        filme favorito = new filme();

        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1958);
        favorito.setDuracaoEmMinutos(185);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do Filme:" + favorito.pegaMedia());
        System.out.println(favorito.getSomaDasAvaliacoes());
        System.out.println(favorito.getTotalDeAvaliacoes());
        */

        serie serie1 = new serie();
        serie1.setAnoDeLancamento(2020);
        serie1.setNome("Teste");
        serie1.setTemporadas(5);
        serie1.setEpisodiosPorTemporada(8);
        serie1.setMinutosPorEpisodio(26);
        System.out.println(serie1.getDuracaoEmMinutos());

    }

}
