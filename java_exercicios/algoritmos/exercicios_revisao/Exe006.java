import java.util.Scanner;

public class Exe006 {
    public static void main(String[] args) {
        /*
         * Soma dos Dígitos
         * Problema: Calcule a soma dos dígitos de um número.
         * Entrada: 123
         * Saída: 6
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma sequência numérica ");
        int numero = teclado.nextInt();
        int soma = 0;
        while (numero != 0) {
            int aux = numero % 10;
            soma += aux;
            numero = numero / 10;
        }
        System.out.println(soma);
    }
}
