package exercicios;

import java.util.Scanner;

public class Exercicio1037Intervalo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();

        if (numero <= 100 && numero > 75)
            System.out.printf("Intervalo (75,100]\n");
        
        else if (numero <= 75 && numero > 50)
            System.out.printf("Intervalo (50,75]\n");
    
        else if (numero <= 50 && numero > 25)
            System.out.printf("Intervalo (25,50]\n");
    
        else if (numero <= 25 && numero >= 0)
            System.out.printf("Intervalo [0,25]\n");
        
        else
            System.out.printf("Fora de intervalo\n");

        sc.close();
    }
}
