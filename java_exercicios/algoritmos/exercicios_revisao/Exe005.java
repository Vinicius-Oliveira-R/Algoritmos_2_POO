import java.util.Scanner;

public class Exe005 {
    public static void main(String[] args) {
        /*
         * Palíndromo
         * Problema: Verifique se uma palavra é um palíndromo.
         * Entrada: radar
         * Saída: Sim
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra para verificarmos se ela é um palindromo: ");
        String palavra = teclado.next();
        String inversao = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            inversao = inversao + palavra.charAt(i);
        }
        // if (palavra != inversao) {
        //     System.out.println("A palavra " + palavra + " é um palindromo");
        // } else {
        //     System.out.println("A palavra " + palavra + " não é um palindromo");
        // }
        boolean palindromo = palavra.equals(inversao);
        System.out.println("É um palindromo? " + palindromo);
    }
}
