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

        carro carro1 = new carro();
        carro1.cor = "Azul";
        carro1.modelo = "Rapido";
        carro1.anoModelo = 2000;
        carro1.mostraFicha();
    }



    /*
    Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.

    Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

    Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para 
    exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

    Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, 
    atribua valores aos seus atributos e utilize o método para exibir as informações.
    */
}
