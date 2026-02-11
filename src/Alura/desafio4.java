package Alura;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* 
        Desafio 1
        System.out.println("DIGITE UM NUMERO");
        int numA = sc.nextInt();
        if (numA > 0) {
            System.out.println("Numero positivo");
            
        } else {
            System.out.println("Numero negativo");
        }
        */

        /* 
        Atividade 2
        System.out.println("PASSE DOIS NUMEROS INTEIROS ABAIXO");
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        if (numB == numC) {
            System.out.println("Numero iguais");
        } else {
            System.out.println("Numeros diferentes");
            if (numB > numC) {
                System.out.println("Primeiro numero maior");
            }else{
                System.out.println("Segundo numero maior");
            }
        }

        */

        /* 
        Atividade 3
        System.out.println("");
        System.out.println("Qual sua escolha?");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Passe as medidas");
                System.out.println("");
                float medidaA = sc.nextFloat();
                float medidaB = sc.nextFloat();
                System.out.println("");
                System.out.println("A área do seu quadrado é: " + (medidaA * medidaB) + "cm");
                
                break;

            case 2:
                System.out.println("Passe as medidas");
                System.out.println("");
                System.out.println("Qual o Raio?");
                float medidaRaio = sc.nextFloat();
                System.out.println("A area do seu circulo é: " + (3.14 * (medidaRaio*medidaRaio)) + "cm");
                
                break;    
        
            default:
                System.out.println("Opção invalida");
                break;
        }
                */

        /*
        Atividade 4
        System.out.println("Me fale o numero que deseja ver a tabuada");
        int numUser = sc.nextInt();
        System.out.println("");
        int numTabuada = 1;

        while (numTabuada <= 10) {
            System.out.println(numUser + " X " + numTabuada + " : " + (numUser * numTabuada));
            numTabuada++;    
        }
        */

        /* 
        Atividade 5
        System.out.println("Me passe um numero");
        int numA = sc.nextInt();

        if (numA % 2 == 0) {
            System.out.println("É par");
        }else{
            System.out.println("Não é par");
        }
        */
        

        sc.close();

        
    


/*
Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", 
caso contrário, exiba "Número negativo".

Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma 
mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular 
área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par
 ou ímpar e exiba uma mensagem correspondente.
 
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número. 
*/

}}
