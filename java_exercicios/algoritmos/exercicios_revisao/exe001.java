import java.util.Scanner;

public class exe001 {
  /*
   * Conversão de Temperatura
   * Problema: Converta uma temperatura de Celsius para Fahrenheit.
   * Fórmula: F = C * 9/5 + 32
   * Entrada: 25
   * Saída: 77
   */
  // public static void main(String[] args) {
  //   int entrada1 = 25;
  //   int calculo = entrada1 * (9 / 5) + 32;
  //   System.out.println("A conversão de " + entrada1 + "°C em fahrenheint é de " + calculo);
  // }
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite a temperatura em Fahrenheit: ");
    int temperatura = teclado.nextInt();
    int conversao = temperatura * (9/5) + 32;
    System.out.println("A conversão de " + temperatura + "°C em fahrenheint é de " + conversao);
  }
  
}