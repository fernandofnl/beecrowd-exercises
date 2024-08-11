package exercicios;

import java.util.Scanner;

public class Exercicio1018Cedulas {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int cedula100 = 0, cedula50 = 0, cedula20 = 0, cedula10 = 0, cedula5 = 0, cedula2 = 0, cedula1 =0;

        int valor = sc.nextInt();

        if (valor > 0 && valor < 1000000){
            cedula100 = valor / 100;
            int resto100 = valor % 100;
            cedula50 = resto100 / 50;
            int resto50 = resto100 % 50;
            cedula20 = resto50 / 20;
            int resto20 = resto50 % 20;
            cedula10 = resto20 / 10;
            int resto10 = resto20 % 10;
            cedula5 = resto10 / 5;
            int resto5 = resto10 % 5;
            cedula2 = resto5 / 2;
            int resto2 = resto5 % 2;
            cedula1 = resto2 / 1;

        }

        System.out.printf("%d\n", valor);    
        System.out.printf("%d nota(s) de R$ 100,00\n", cedula100);
        System.out.printf("%d nota(s) de R$ 50,00\n", cedula50);
        System.out.printf("%d nota(s) de R$ 20,00\n", cedula20);
        System.out.printf("%d nota(s) de R$ 10,00\n", cedula10);
        System.out.printf("%d nota(s) de R$ 5,00\n", cedula5);
        System.out.printf("%d nota(s) de R$ 2,00\n", cedula2);
        System.out.printf("%d nota(s) de R$ 1,00\n", cedula1);

        sc.close();
    }

}
