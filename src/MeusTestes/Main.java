package MeusTestes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int escolhaMenu = 0;

        pessoa pessoa1 = new pessoa();
        System.out.print("ESCREVA NOME: ");
        pessoa1.setNome(input.nextLine());
        System.out.println("");
        System.out.print("SUA IDADE: ");
        pessoa1.setIdade(input.nextInt());

        if (pessoa1.getIdade() < 18) {
            System.out.println("Não pode criar conta");
        } else {
            System.out.println("Pode criar conta");
            pessoa1.criarConta();
        }

        while (escolhaMenu != 3) {

            System.out.println("O que deseja fazer?");
            System.out.println("1 - ADICIONAR SALDO");
            System.out.println("2 - VER SALDO");
            System.out.println("3 - SAIR");
            escolhaMenu = input.nextInt();

            switch (escolhaMenu) {
                case 1:
                    pessoa1.adicionarSaldo();
                    break;

                case 2:
                    System.out.println(pessoa1.getSaldo());
                    break;

                case 3:
                    System.out.println("Saindo!");
                    break;

                default:
                    System.out.println("Opção invalida!");
                    break;
            }

        }

        input.close();

    }
}
