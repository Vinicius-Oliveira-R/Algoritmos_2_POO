package torneio;



public class MergeTorneio {

    public void ordenar(int[] vetor) {
        if (vetor == null || vetor.length < 2) {
            return;
        }
        mergeSort(vetor, 0, vetor.length - 1);
    }

    private void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, inicio, meio);
            mergeSort(vetor, meio + 1, fim);
            merge(vetor, inicio, meio, fim);
        }
    }

    private void merge(int[] vetor, int inicio, int meio, int fim) {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;

        int[] esquerda = new int[n1];
        int[] direita = new int[n2];

        for (int i = 0; i < n1; i++)
            esquerda[i] = vetor[inicio + i];
        for (int j = 0; j < n2; j++)
            direita[j] = vetor[meio + 1 + j];

        int i = 0, j = 0, k = inicio;
        while (i < n1 && j < n2) {
            if (esquerda[i] <= direita[j]) {
                vetor[k] = esquerda[i];
                i++;
            } else {
                vetor[k] = direita[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            vetor[k] = esquerda[i];
            i++;
            k++;
        }

        while (j < n2) {
            vetor[k] = direita[j];
            j++;
            k++;
        }
    }
}