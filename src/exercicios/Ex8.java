package exercicios;

public class Ex8 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 0;
        do {
            i++;
            soma += i;
        } while (i < 10);
        System.out.println("Soma: " + soma);
    }
}
