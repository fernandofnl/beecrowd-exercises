package exercicios;

import java.util.Scanner;

public class Exercicio1016Distancia {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int km = sc.nextInt();

        int distancia = km * 2;

        System.out.printf("%d minutos\n", distancia);

        sc.close();
    }
}
