package Alura.DesafioPOO.Desafio2;

import java.util.Scanner;

public class aluno {
    Scanner input = new Scanner(System.in);
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void calculaMedia() {
        int quantidadeNotas = 0;
        double media;
        while (quantidadeNotas < 3) {
            System.out.println("Qual são as notas do aluno?");
            this.nota = this.nota + input.nextDouble();
            quantidadeNotas++;
        }
        media = this.nota / quantidadeNotas;
        System.out.printf("Média: %.2f", media);

    }

    

}
