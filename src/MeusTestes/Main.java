package MeusTestes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

        System.out.println("Deseja adicionar saldo?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        int escolha = input.nextInt();

        if (escolha == 1) {
            pessoa1.adicionarSaldo();
        } else {
            System.out.println("OK");
        }

        input.close();

    }

}
