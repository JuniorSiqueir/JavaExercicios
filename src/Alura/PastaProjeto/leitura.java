package Alura.PastaProjeto;

import java.util.Scanner;

public class leitura {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual é o nome do seu filme?");
        String nome = input.nextLine();
        System.out.println("Qual é o ano do filme?");
        int ano = input.nextInt();
        System.out.println("Qual sua nota do filme?");
        float  nota = input.nextFloat();

        if (ano > 2020){
            System.out.println("Filme novo");
        }else {
            System.out.println("Filme velho");
        }

    }
}
