package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1006Media2 {
    
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        double MEDIA = ((A * 2)+(B * 3)+(C * 5))/10;
        
        System.out.printf("MEDIA = %.1f%n", MEDIA);
        
        sc.close();
        
    }
}
