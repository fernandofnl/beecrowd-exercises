package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1012Area {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double areaTriangulo = (A * C) / 2.0;
        double areaCirculo = pi * C * C;
        double areaTrapezio = ((A + B) * C) / 2.0;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        sc.close();

    }
}
