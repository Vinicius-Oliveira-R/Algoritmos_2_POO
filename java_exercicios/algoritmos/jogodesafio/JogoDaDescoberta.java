package jogodesafio;

import java.util.Random;
import java.util.Scanner;

public class JogoDaDescoberta {
    /*
     * Jogo da Descoberta
     * O objetivo do jogo é desafiar o usuário a decifrar palavras embaralhadas. O
     * sistema seleciona aleatoriamente uma palavra, embaralha suas letras e permite
     * que o usuário tente adivinhar a versão correta.
     * Regras do jogo:
     * O programa deve possuir um vetor de palavras predefinidas.
     * O programa escolhe uma dessas palavras aleatoriamente, embaralha as letras e
     * exibe ao usuário.
     * O usuário pode tentar adivinhar a palavra correta.
     * O usuário pode pedir uma dica, que mostrará a primeira e última letra da
     * palavra.
     * O jogo permite várias tentativas até que o usuário acerte ou desista.
     * O jogo termina quando o usuário acertar ou decide desistir.
     * 
     */

    // Lista de palavras do jogo
    static String[] palavras = {
            "computador", "java", "teclado", "monitor", "programacao", "algoritmo", "internet", "rede", "codigo",
            "variavel"
    };

    // Embaralha as letras de uma palavra
    public static String embaralhar(String palavra) {
        char[] letras = palavra.toCharArray();
        Random random = new Random();
        for (int i = 0; i < letras.length; i++) {
            int pos = random.nextInt(letras.length);
            char temp = letras[i];
            letras[i] = letras[pos];
            letras[pos] = temp;
        }
        return new String(letras);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Escolhe uma palavra aleatória
        String palavraOriginal = palavras[random.nextInt(palavras.length)];
        String palavraEmbaralhada = embaralhar(palavraOriginal);

        System.out.println("Jogo da Descoberta");
        System.out.println("Tente adivinhar a palavra embaralhada");
        System.out.println("Você pode digitar 'dica' para receber uma dica ou 'desistir' para sair.");

        System.out.println("Palavra embaralhada: " + palavraEmbaralhada);

        while (true) {
            System.out.print("Sua tentativa: ");
            String tentativa = scanner.nextLine().toLowerCase();

            if (tentativa.equals("desistir")) {
                System.out.println("Você desistiu. A palavra era: " + palavraOriginal);
                break;
            } else if (tentativa.equals("dica")) {
                System.out.println("Dica: A palavra começa com '" + palavraOriginal.charAt(0) + "' e termina com '"
                        + palavraOriginal.charAt(palavraOriginal.length() - 1));
            } else if (tentativa.equals(palavraOriginal)) {
                System.out.println("Parabéns! Você acertou a palavra: " + palavraOriginal);
                break;
            } else {
                System.out.println("Errado! Tente novamente ou digite 'dica' ou 'desistir'.");
            }
        }

        scanner.close();
    }
}
