import java.util.Scanner;

public class Exe003 {
    /*
     * Fatorial de um Número
     * Problema: Calcule o número fatorial de um número.
     * Entrada: 5
     * Saída: 120
     */
    /*
     * public static void main(String[]args) {
     * int numero = 5;
     * int fatorial = 1;
     * for (int i = 1; i <= numero; i++) {
     * 
     * fatorial = fatorial * i;
     * System.out.println(fatorial);
     * }
     * }
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero para calcularmos o seu fatorial: ");
        int numero = teclado.nextInt();
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial*i;
        }
        System.out.println(fatorial);
    }
}
