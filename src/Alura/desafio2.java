package Alura;

import java.util.Random;
import java.util.Scanner;

public class desafio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100);
        int numTentativas = 0;
        System.out.println("BEM VINDO AO ADVINHA!");

        while (numTentativas < 5) {
            System.out.println("Passe seu numero");
            int numeroUser = sc.nextInt();
            numTentativas++;
            if (numeroUser > numeroAleatorio) {
                System.out.println("Seu numero é maior que o escolhido");
                System.out.println("====================================");
            } else if (numeroUser < numeroAleatorio) {
                System.out.println("Seu numero é menor que o escolhido");
                System.out.println("====================================");
            }else {
                System.out.println("ACERTOU!");
                System.out.println("====================================");
            }
        }



    }


    /*
    Agora é com você! Pratique os conceitos que foram ensinados ao longo dessa aula com o seguinte

    desafio:

    Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório
    entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
    A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

    Dicas:
    Para gerar um número aleatório em Java: new Random(). nextInt (100);
    Utilize o Scanner para obter os dados do usuário;
    Utilize uma variável para contar as tentativas;
    Utilize um loop para controlar as tentativas;


    Utilize a instrução break; para interromper o loop.

     */
}
