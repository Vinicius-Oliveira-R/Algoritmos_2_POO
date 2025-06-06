public class Exe011 {
    /*
     * Contagem de Palavras
     * Problema: Conte o número de palavras em uma frase.
     * Entrada: Olá mundo da programação
     * Saída: 4
     */
    public static void main(String[] args) {
        String frase = "Olá mundo da programação";
        String[] palavras = frase.split(" ");
        System.out.println("Número de palavras: " + palavras.length);
    }
}
