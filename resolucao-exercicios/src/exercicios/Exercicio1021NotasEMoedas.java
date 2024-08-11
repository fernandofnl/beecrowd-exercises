package exercicios;

import java.util.Scanner;

public class Exercicio1021NotasEMoedas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double dinheiro = sc.nextDouble();

        int valorCentavos = (int) Math.round(dinheiro * 100);

        int nota100 = valorCentavos / 10000;
        int resto = valorCentavos % 10000;
        int nota50 = resto / 5000;
        resto = resto % 5000;
        int nota20 = resto / 2000;
        resto = resto % 2000;
        int nota10 = resto / 1000;
        resto = resto % 1000;
        int nota5 = resto / 500;
        resto = resto % 500;
        int nota2 = resto / 200;
        resto = resto % 200;
        int moeda1 = resto / 100;
        resto = resto % 100;
        int moeda50 = resto / 50;
        resto = resto % 50;
        int moeda25 = resto / 25;
        resto = resto % 25;
        int moeda10 = resto / 10;
        resto = resto % 10;
        int moeda5 = resto / 5;
        resto = resto % 5;
        int moeda01 = resto;

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", nota100);
        System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
        System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
        System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
        System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
        System.out.printf("%d nota(s) de R$ 2.00\n", nota2);

        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moeda50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moeda25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moeda10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moeda5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moeda01);

        sc.close();
    }

}
