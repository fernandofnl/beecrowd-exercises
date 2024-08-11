package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1004ProdutoSimples {

    public static void main(String[] args) throws IOException {
 
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int z = sc.nextInt();
        
        int PROD = x * z;
        
        System.out.printf("PROD = %d\n", PROD);
 
        sc.close();
    }
    
}
