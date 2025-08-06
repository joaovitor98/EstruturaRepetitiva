package exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int calc = 0;
        System.out.println("Digite um numero");
        int num = leitura.nextInt();
        calc += num;
        while (num != 0) {
            System.out.println("Digite um numero");
            num = leitura.nextInt();
            calc += num;
        }
        System.out.println(calc);
    }
}
