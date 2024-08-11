package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1010CalculoSimples {
        
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int codigoPeca, codigoPeca2, numeroPeca, numeroPeca2;
        double valorPeca, valorPeca2, total;

        codigoPeca = sc.nextInt();
        numeroPeca = sc.nextInt();
        valorPeca = sc.nextDouble();
        codigoPeca2 = sc.nextInt();
        numeroPeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
        total = (numeroPeca * valorPeca) + (numeroPeca2 * valorPeca2); 

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        sc.close();
    }

}
