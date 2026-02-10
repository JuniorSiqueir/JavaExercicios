package Alura.PastaProjeto;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        

        for (int i = 0; i < 3; i++) {
            System.out.println("Escreva as notas dos filmes!");
            nota = input.nextDouble();
            media += nota;
        }
        System.out.printf("NOTAS = %.2f", media/3);

        
        

        input.close();
    }

}
