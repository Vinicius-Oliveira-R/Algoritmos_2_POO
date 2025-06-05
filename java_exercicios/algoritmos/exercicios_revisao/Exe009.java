
import java.util.Scanner;

public class Exe009 {
    public static void main(String[] args) {
        /*
         * Conversão de Base Decimal para Binário
         * Problema: Converta um número decimal para binário.
         * Entrada: 10
         * Saída: 1010
         */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número decimal:");
        int numeroDecimal = teclado.nextInt();
        int numeroDigitado = numeroDecimal;
        String binario = "";
        while (numeroDecimal > 0) {
            int resto = numeroDecimal%2;
            binario = resto + binario;
            numeroDecimal = numeroDecimal/2;
        }
        System.out.println("O numero "+numeroDigitado+" convertido para binário fica: "+binario);
    }
}