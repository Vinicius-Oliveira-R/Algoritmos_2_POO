
public class Exe001 {
    /*
     * Dada a sequência de números:
     * [3, 4, 9, 2, 5, 8, 2, 1, 7], ordene-a em ordem não decrescente segundo os
     * seguintes algoritmos, apresentando a sequência obtida após cada passo do
     * algoritmo:
     * Bubble Sort
     * Selection Sort
     * Insertion Sort
     * Merge Sort
     */
    public static void main(String[] args) {
        int[] numeros = { 3, 4, 9, 2, 5, 8, 2, 1, 7 };
        int aux[] = new int[numeros.length];
        System.out.println("Bubble Sort: ");
        bubbleSort(numeros);
        System.out.println("----------------------------------------");
        System.out.println("Selection Sort: ");
        selectionSort(numeros);
        System.out.println("----------------------------------------");
        System.out.println("Insertion Sort: ");
        insertionSort(numeros);
        System.out.println("----------------------------------------");
        System.out.println("Merge Sort: ");
        mergeSort(numeros, aux, 0, numeros.length - 1);
        ImprimeVetor(numeros);
    }

    public static void ImprimeVetor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        int aux = array.length;
        for (int i = 0; i < aux; i++) {
            for (int j = 0; j < aux - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        ImprimeVetor(array);
    }
    public static void selectionSort(int[]array){
        int aux = array.length;
        for (int i = 0; i < aux-1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < aux; j++) {

                if(array[j] < array[minIndex]){
                    minIndex = j;
                }

                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
        ImprimeVetor(array);
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        ImprimeVetor(array);
    }

    public static void mergeSort(int array[], int[] aux, int inicio, int fim) {
        int meio = (inicio + fim) / 2;
        if (inicio < fim) {
            mergeSort(array, aux, inicio, meio);
            mergeSort(array, aux, meio + 1, fim);
            intercalacao(array, aux, inicio, meio, fim);
        }

    }

    public static void intercalacao(int[] array, int[] aux, int inicio, int meio, int fim) {
        for (int x = inicio; x <= fim; x++) {
            aux[x] = array[x];
        }
        int esquerda = inicio;
        int direita = meio + 1;
        for (int x = inicio; x <= fim; x++) {
            if (esquerda > meio) {
                array[x] = aux[direita++];
            } else if (direita > fim) {
                array[x] = aux[esquerda++];
            } else if (aux[esquerda] < aux[direita]) {
                array[x] = aux[esquerda++];
            } else {
                array[x] = aux[direita++];
            }
        }

    }
}