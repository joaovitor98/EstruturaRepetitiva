package exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = leitura.nextInt();

        while (num < 0) {
            System.out.println("Digite um numero: ");
            num = leitura.nextInt();
        }
    }
}
