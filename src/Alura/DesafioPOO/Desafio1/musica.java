package Alura.DesafioPOO.Desafio1;

public class musica {
    String artista;
    String titulo;
    int anoLancamento;
    double avaliacoesIndividuais;
    double numeroDeAvaliacoes;

    void fichaMusica(){
        System.out.println("Compositor: " + artista);
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano de Lancamento: " + anoLancamento);
    }

    void avaliacao(double nota){
        avaliacoesIndividuais += nota;
        numeroDeAvaliacoes++;
    }

    double calculaMedia(){
        return avaliacoesIndividuais / numeroDeAvaliacoes;
    }
}
