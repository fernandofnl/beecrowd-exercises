package exercicios;

import java.io.IOException;
import java.util.Scanner;

public class Exercicio1009SalarioComBonus {
    
    public static void main(String[] args) throws IOException {
    
    Scanner sc = new Scanner(System.in);
    String nome = sc.nextLine();
    double salario = sc.nextDouble();
    double vendas = sc.nextDouble();
    
    double comissao = (vendas * 0.15) + salario;   

    System.out.printf("TOTAL = R$ %.2f\n", comissao);
 
    sc.close();
    
    }
}
