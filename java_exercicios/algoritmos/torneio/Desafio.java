package torneio;

import java.util.Random;

public class Desafio {

    // Função para criar um vetor com números aleatórios
    public static int[] criarVetorAleatorio(int tamanho, Random random) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt();
        }
        return vetor;
    }

    // Cria um vetor já ordenado (crescente)
    public static int[] criarVetorOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        return vetor;
    }

    // Cria um vetor em ordem decrescente
    public static int[] criarVetorReverso(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = tamanho - i;
        }
        return vetor;
    }

    public static void main(String[] args) {
        Random random = new Random();

        // Tamanhos diferentes para testar os algoritmos
        int[] tamanhos = { 10000, 50000, 100000, 500000 };

        // Algoritmos que vou comparar
        BubbleTorneio bubbleSort = new BubbleTorneio();
        InsertionTorneio insertionSort = new InsertionTorneio();
        SelectionTorneio selectionSort = new SelectionTorneio();
        MergeTorneio mergeSort = new MergeTorneio();

        for (int tam : tamanhos) {
            System.out.println("\nAnalisando vetor de tamanho: " + tam);

            // Vetores com diferentes padrões
            int[][] vetoresTeste = {
                criarVetorOrdenado(tam),
                criarVetorReverso(tam),
                criarVetorAleatorio(tam, random)
            };
            String[] tipos = { "Ordenado", "Reverso", "Aleatório" };

            for (int i = 0; i < vetoresTeste.length; i++) {
                System.out.println("Vetor do tipo: " + tipos[i]);

                // Teste com Bubble Sort
                int[] copia = vetoresTeste[i].clone();
                long inicio = System.currentTimeMillis();
                bubbleSort.ordenar(copia);
                long fim = System.currentTimeMillis();
                System.out.println("Bubble Sort demorou: " + (fim - inicio) + " ms");

                // Teste com Insertion Sort
                copia = vetoresTeste[i].clone();
                inicio = System.currentTimeMillis();
                insertionSort.ordenar(copia);
                fim = System.currentTimeMillis();
                System.out.println("Insertion Sort demorou: " + (fim - inicio) + " ms");

                // Teste com Selection Sort
                copia = vetoresTeste[i].clone();
                inicio = System.currentTimeMillis();
                selectionSort.ordenar(copia);
                fim = System.currentTimeMillis();
                System.out.println("Selection Sort demorou: " + (fim - inicio) + " ms");

                // Teste com Merge Sort
                copia = vetoresTeste[i].clone();
                inicio = System.currentTimeMillis();
                mergeSort.ordenar(copia);
                fim = System.currentTimeMillis();
                System.out.println("Merge Sort demorou: " + (fim - inicio) + " ms");
            }
        }
    }
}
