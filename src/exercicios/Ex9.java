package exercicios;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        double soma = 0;
        int i = 0;
        Scanner leitura = new Scanner(System.in);
        do {
            i++;
            System.out.println("Digite um numero;");
            double num = leitura.nextDouble();
            soma += num;
        } while (i < 10);
        soma /= 10;
        System.out.println(soma);
    }
}
