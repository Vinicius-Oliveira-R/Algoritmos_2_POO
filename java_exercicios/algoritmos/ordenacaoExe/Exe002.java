

public class Exe002 {
    /*
     * Ordenação Decrescente
     * Modifique o algoritmo de ordenação para ordenar um vetor de números inteiros
     * em ordem decrescente.
     * 
     * Entrada: [3, 0, -2, 5, 8]
     * Saída: [8, 5, 3, 0, -2]
     */
    public static void main(String[] args) {
        int[] vetor = {3, 0, -2, 5, 8};
        bubbleSort(vetor);
    }
     public static void bubbleSort(int[]array){
        int aux[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print("Vetor ordenado em ordem decrescente: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
     }
}
