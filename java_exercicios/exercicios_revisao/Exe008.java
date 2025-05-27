
import java.util.Scanner;



public class Exe008 {
    public static void main(String[] args) {
        /*
         * Contagem de Vogais
         * Problema: Conte o número de vogais em uma string sem utilizar a função
         * length.
         * Entrada: programacao
         * Saída: 5
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = teclado.nextLine();
        int contador = 0;
        for (int i = 0; i < palavra.toCharArray().length; i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("Número de vogais: " + contador);
    }
}
