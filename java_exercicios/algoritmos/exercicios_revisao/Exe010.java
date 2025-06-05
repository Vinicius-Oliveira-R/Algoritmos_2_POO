public class Exe010 {
    /*
     * Potência de Dois Números
     * Problema: Calcule a potência de um número em relação a outro.
     * Entrada: 2 3
     * Saída: 8
     */

    public static void main(String[] args) {
        int[] vetor = { 2, 3 };
        int base = vetor[0];
        int expoente = vetor[1];
        int contar = (int) Math.pow(base, expoente);
        System.out.println(contar);

    }
}
