
import java.util.Scanner;

public class Exe014 {
    /*
     * Soma de Pares
     * Problema: Calcule a soma de todos os números pares entre 1 e N (inclusive).
     * Entrada: 10
     * Saída: 30
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();
        int soma = 0;
        for(int i = 2; i<=numero; i+=2){
            soma+=i;
        }
        System.out.println(soma);
    }

}
