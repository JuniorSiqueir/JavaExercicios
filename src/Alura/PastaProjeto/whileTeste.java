
package Alura.PastaProjeto;
import java.util.Scanner;

public class whileTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int quantidadeNotasInseridas = 0;
        

        while (nota != -1) {
            System.out.println("Escreva as notas dos filmes ou -1 para sair");
            nota = input.nextDouble();
            if (nota != -1) {
                media += nota;
                quantidadeNotasInseridas++;
            }
        }
        System.out.printf("NOTAS = %.2f", media/quantidadeNotasInseridas);

        
        

        input.close();
    }
        
    }


