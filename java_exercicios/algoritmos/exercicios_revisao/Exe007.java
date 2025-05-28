public class Exe007 {
    public static void main(String[] args) {
        /*
         * Ordenação de Três Números
         * Problema: Ordene três números em ordem crescente.
         * Entrada: 3 1 2
         * Saída: 1 2 3
         */
        int[] entrada = {3,2,1};
        int aux;
        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada.length-1; j++) {
                if(entrada[j]>entrada[j+1]){
                    aux = entrada[j];
                    entrada[j]=entrada[j+1];
                    entrada[j+1] = aux;
                }
            }
        }
        for (int i = 0; i < entrada.length; i++) {
            System.err.println(entrada[i]);
        }
    }
}