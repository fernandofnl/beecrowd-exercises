package exercicios;

import java.util.Scanner;

public class Exercicio1014Consumo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        double Y = sc.nextDouble();
        
        double consumoMedio = X / Y;

        System.out.printf("%.3f km/l", consumoMedio);

        sc.close();
    }

}
