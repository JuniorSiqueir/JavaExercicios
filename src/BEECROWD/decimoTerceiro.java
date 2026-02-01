package BEECROWD;

import java.util.Scanner;

public class decimoTerceiro {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();

    float areaTriangulo = (a*c)/2;
    System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);

    double areaCirculo = 3.14159 * (c * c);
    System.out.printf("CIRCULO: %.3f%n", areaCirculo);

    double areaTrapezio = ((a + b) * c) / 2;
    System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);

    double areaQuadrado = b * b;
    System.out.printf("QUADRADO: %.3f%n", areaQuadrado);

    double areaRetangulo = a * b;
    System.out.printf("RETANGULO: %.3f%n", areaRetangulo);
    

    sc.close();
    
}
/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas a
cima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 
O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal. */
}
