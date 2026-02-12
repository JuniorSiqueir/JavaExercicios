package Alura.DesafioPOO.Desafio1;

public class Main {
    static void main(String[] args) {
        pessoa p1 = new pessoa();
        p1.nome = "Fulano";
        p1.olaFulano();

        calculadora c1 = new calculadora();
        c1.num1 = 6;
        System.out.println(c1.dobro());

        musica m1 = new musica();
        m1.artista = "Neymar";
        m1.anoLancamento = 2020;
        m1.titulo = "Fulano";
        m1.fichaMusica();

        m1.avaliacao(8);
        m1.avaliacao(5);
        m1.avaliacao(0);
        m1.avaliacao(6);
        m1.avaliacao(3);
        System.out.println(m1.numeroDeAvaliacoes);
        System.out.println(m1.calculaMedia());
    }
}
