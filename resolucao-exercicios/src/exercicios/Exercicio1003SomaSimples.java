package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1003SomaSimples {
    
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int SOMA = A + B;
        
        System.out.printf("SOMA = %d\n", SOMA);
 
 
        sc.close();
    }
}
