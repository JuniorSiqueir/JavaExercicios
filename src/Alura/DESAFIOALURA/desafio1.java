package Alura.DESAFIOALURA;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //EX1
        System.out.println("ESCREVA O PRIMEIRO NUMERO:");
        double notaA = input.nextDouble();
        System.out.println("ESCREVA O SEGUNDO NUMERO:");
        double notaB = input.nextDouble();
        double media = (notaA + notaB) / 2;
        System.out.println("MÉDIA = " + media);

        //EX2
        System.out.println("ESCREVA ALTURA DO ALUNO:");
        double alturaAluno = input.nextDouble();
        int alturaInt = (int) alturaAluno;
        System.out.println("Altura do aluno: " + alturaInt);

        //EX3
        System.out.println("ESCREVA NOTA DO ALUNO:");
        char notaAluno = input.next().charAt(0);
        System.out.println("ESCREVA O TEXTO GENERICO:");
        String textoGenerico = input.next();
        System.out.println("A NOTA DO ALUNO É " + notaAluno + " esse é o texto genérico: " + textoGenerico);

        //EX4
        System.out.println("Qual é o preço do produto?");
        double precoProduto = input.nextDouble();
        System.out.println("Qual é a quantidade do produto?");
        int quantidadeProduto = input.nextInt();
        double valorEstoque = precoProduto * quantidadeProduto;
        System.out.println("Valor do estoque: " + valorEstoque);

        //EX5
        System.out.println("Qual é o seu dinheiro em dolar?");
        double valorEmDolares = input.nextDouble();
        double valorEmReais = valorEmDolares * 4.94;
        System.out.printf("Você tem %.2fR$ em reais", valorEmReais);

        //EX6
        System.out.println("QUAL É O PREÇO DO SEU PRODUTO?");
        double precoOriginal = input.nextDouble();
        System.out.println("QUANTOS % DE DESCONTO VOCÊ DESEJA DAR?");
        double percentualDesconto = input.nextDouble();
        double valorDesconto = precoOriginal - (percentualDesconto / 100);
        System.out.printf("Valor final do produto: R$ %.2f%n", valorDesconto);


        input.close();
    }

    /*
     * Em Java, a manipulação eficiente de variáveis é crucial para
     * armazenar dados em memória. Os tipos primitivos, como inteiros, ponto flutuante,
     * char e boolean, desempenham papéis específicos. A classe String é essencial para 
     * operações com textos.
     * O casting resolve conflitos de tipos, permitindo conversões explícitas.
     *
     * Essas habilidades formam a base para o desenvolvimento eficaz de programas em Java, por isso 
     * criamos atividades
     * práticas (não obrigatórias) para você praticar. Vamos praticar?
     *
     * 1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado.
     * 
     * 2 - Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável 
     * double para int e imprima o resultado.
     * 
     * 3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). 
     * Atribua valores a essas variáveis e concatene-as em uma mensagem.
     * 
     * 4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). 
     * Calcule o valor total multiplicando o preço do produto
     * pela quantidade e apresente o resultado em uma mensagem.
     * 
     * 5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a 
     * essa variável. Considere que o valor de 1 dólar é
     * equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima 
     * o resultado formatado.
     * 
     * 6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, 
     * representando o preço original de um produto.
     * Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual
     *  de desconto ao produto (por exemplo, 10 para 10%).
     * Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com 
     * desconto.*/
}
