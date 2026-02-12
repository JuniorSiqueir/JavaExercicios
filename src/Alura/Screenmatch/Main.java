package Alura.Screenmatch;

import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.nome = "The Matrix";
        favorito.anoDeLancamento = 1999;
        favorito.duracaoEmMinutos = 135;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(9);

        System.out.println("Média de avaliações do Filme:"  + favorito.pegaMedia());
        System.out.println(favorito.getSomaDasAvaliacoes());
        System.out.println(favorito.getTotalDeAvaliacoes());





    }

}
