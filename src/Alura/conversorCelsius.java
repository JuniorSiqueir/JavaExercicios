package Alura;

import java.util.Scanner;

public class conversorCelsius {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        int testeCasting = (int) fahrenheit;
        System.out.println(fahrenheit);
        System.out.println(testeCasting);
        sc.close();
    }
}
