package Alura.DESAFIOALURA;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        String nome = "Junin";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        System.out.println("***********************");
        System.out.println("NOME: " + nome);
        System.out.println("TIPO DA CONTA: " + tipoConta);
        System.out.println("VALOR DE SALDO: " + saldo + "R$");
        System.out.println("***********************");

        while (escolha != 4) {
            System.out.println("Operações");
            System.out.println("1. Consultar");
            System.out.println("2. Receber");
            System.out.println("3. Transferir");
            System.out.println("4. Sair");
            System.out.println("");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Esse é o seu saldo: " + saldo + "R$");
                    break;
                case 2:
                    System.out.println("Quanto você recebeu?");
                    int valorRecebido = input.nextInt();
                    if(valorRecebido < 0) {
                        System.out.println("Valor invalido");
                    }else{
                    System.out.println("Valor depositado");
                    saldo += valorRecebido;
                    }
                    break;
                case 3:
                    System.out.println("Quanto você deseja passar?");
                    int valorPassar = input.nextInt();
                    if(valorPassar > saldo || valorPassar < 0) {
                        System.out.println("Valor invalido ou sem saldo");
                    }else{
                        System.out.println("Valor transferido");
                        saldo -= valorPassar;
                    }
                    break;
                case 4:
                    System.out.println("Saindo do sistema");
                    break;
                default:
                    System.out.println("Escolha invalida");
                    break;
            }

        }
        input.close();

    }

    /*






     */

}
