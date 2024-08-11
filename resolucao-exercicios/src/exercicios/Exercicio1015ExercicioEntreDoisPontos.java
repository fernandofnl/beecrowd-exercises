package exercicios;

import java.util.Scanner;

public class Exercicio1015ExercicioEntreDoisPontos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distancia = Math.pow(((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)), 0.5);

        System.out.printf("%.4f\n", distancia);

        sc.close();

    }

}
