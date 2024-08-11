package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1001ExtremamenteBasico {

    public static void main(String[] args) throws IOException {
 
        Scanner teclado = new Scanner(System.in);
        
        int A;
        int B;
        
    
        A = teclado.nextInt();
        B = teclado.nextInt();
        
        int X = A + B;
        
        System.out.println("X = " + X);
                
        teclado.close();
    }
    
}
