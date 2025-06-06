
import java.util.Scanner;

public class Exe012 {
    /*
     * 
     * Média Geométrica
     * Problema: Calcule a média geométrica de três números.
     * Fórmula: M = (a * b * c)^(1/3)
     * Entrada: 2 8 4
     * Saída: 4
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números inteiros: ");
        System.out.println("Número 1: ");
        int a = sc.nextInt();
        System.out.println("Número 2: ");
        int b = sc.nextInt();
        System.out.println("Número 3: ");
        int c = sc.nextInt();
        double mediaGeometrica = Math.cbrt(a * b * c);
        System.out.printf("A média geométrica é: %.2f%n", mediaGeometrica);
    }
}
