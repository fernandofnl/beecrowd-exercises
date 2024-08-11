package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1007Diferenca {
    
    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int DIFERENCA = (A * B - C * D);
        System.out.printf("DIFERENCA = %d%n", DIFERENCA);
        
        sc.close();
        
    }
}
