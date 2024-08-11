package exercicios;

import java.util.Scanner;

public class Exercicio1017GastoDeCombustivel {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tempoGasto = sc.nextInt();
        int vel_media = sc.nextInt();

        int qtdKmPercorrido = vel_media * tempoGasto;

        double qtdLitrosGasto = qtdKmPercorrido / 12.0;

        System.out.printf("%.3f\n", qtdLitrosGasto);

        sc.close();
    }


}
