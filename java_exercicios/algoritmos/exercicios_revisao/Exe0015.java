
import java.util.Scanner;

public class Exe0015 {
    /*
     * Soma de Números em Intervalo
     * Problema: Calcule a soma de todos os números em um intervalo [a, b].
     * Entrada: 1 5
     * Saída: 15
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2 = sc.nextInt();
        int aux = 0;
        int soma = 0;
        while(numero1 > numero2) {
            System.out.println("O primeiro número deve ser maior que o segundo. Digite novamente: ");
            numero1 = sc.nextInt();
        } 
            for (int i = numero1; i <= numero2; i++) {
                soma+=i;
            }
        
        System.out.println("A soma de todos os números de "+numero1+" até "+numero2+" é: "+soma);

    }
}