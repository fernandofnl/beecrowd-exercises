package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1011Esfera {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double pi = 3.14159;

        double volume = (4.0/3.0) * pi * (R*R*R);

        System.out.printf("VOLUME = %.3f\n", volume);

        sc.close();
    }

}
