package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1002AreaDoCirculo {

    public static void main(String[] args) throws IOException {
 
    Scanner sc = new Scanner(System.in);    
     double n = 3.14159;
     double raio, area;
     
     raio = sc.nextDouble();
     
     area = n * raio * raio;
     
    System.out.printf("A=%.4f%n", area);

    sc.close();

    }
    
}
