
import java.util.Scanner;

public class Exe013 {
    /*
     * EXE013 - Maior de Três Números
     * Problema: Determine o maior entre três números.
     * Entrada: 5 7 3
     * Saída: 7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números: ");
        System.out.println("Número 1: ");
        int numero1 = sc.nextInt();
        System.out.println("Número 2: ");
        int numero2 = sc.nextInt();
        System.out.println("Número 3: ");
        int numero3 = sc.nextInt();
        int maior;
        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
        }else if (numero2 > numero3 ) {
            maior = numero2;
        } else {
            maior = numero3;
        }
        System.out.println(maior);
    }
}
