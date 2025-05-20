import java.util.Scanner;

public class Exe002 {
    /*
     * Média de Três Números
     * Problema: Escreva um programa/método que receba três números e calcule a
     * média aritmética deles.
     * Entrada: 4 6 8
     * Saída: 6
     */
    // public static void main(String[] args) {
    //     int entrada1 = 4;
    //     int entrada2 = 6;
    //     int entrada3 = 8;
    //     int media = (entrada1 + entrada2 + entrada3) / 3;
    //     System.out.println("A média de " + entrada1 + " + " + entrada2 + " + " + entrada3 + " é: " + media);
    // }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = teclado.nextInt();
        System.out.println("Digite o segundo: ");
        int numero2 = teclado.nextInt();
        System.out.println("Digite o terceiro número: ");
        int numero3 = teclado.nextInt();
        int media = (numero1 + numero2 + numero3) /3;
        System.out.println("A média de " + numero1 + " + " + numero2 + " + " + numero3 + " é: " + media);
    }

}
