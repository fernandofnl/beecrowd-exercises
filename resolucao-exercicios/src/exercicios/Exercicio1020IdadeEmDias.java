package exercicios;

import java.util.Scanner;

public class Exercicio1020IdadeEmDias {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();

        int qtdAno = idade / 365;
        int restoAno = idade % 365;
        int qtdMes = restoAno / 30;
        int restoMes = restoAno % 30;

        System.out.printf("%d ano(s)\n", qtdAno);
        System.out.printf("%d mes(es)\n", qtdMes);
        System.out.printf("%d dia(s)\n", restoMes);

        sc.close();
    }


}
