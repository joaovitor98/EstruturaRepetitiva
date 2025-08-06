package exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int mult;
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num = leitura.nextInt();

        for (int i = 0; i <= 10; i++) {
            mult = num * i;
            System.out.println(num + " * " + i + " = " + mult);
        }
    }
}
