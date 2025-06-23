package torneio;

public class SelectionTorneio {
    
    public void ordenar(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = vetor[i];
                vetor[i] = vetor[minIndex];
                vetor[minIndex] = temp;
            }
        }
    }
}