package exercicios;

import java.util.Scanner;

public class Exercicio1019ConversaoDeTempo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();

        int tempoH = tempo / 3600;
        int restoTempoS = tempo % 3600;
        int tempoM = restoTempoS / 60;
        restoTempoS = restoTempoS % 60;

        System.out.printf("%d:%d:%d\n", tempoH, tempoM, restoTempoS);
        
        sc.close();
    }
}
