public class Exe016 {
    /*
     * Multiplicação de Matrizes 2x2
     * Problema: Multiplique duas matrizes 2x2.
     * Entrada:
     * 1 2
     * 3 4
     * 
     * 5 6
     * 7 8
     * 
     * Saída:
     * 19 22
     * 43 50
     */
    public static void main(String[] args) {
        int[][] matriz1 ={
            {1,2},
            {3,4}
        };
        int[][] matriz2 = {
            {5,6},
            {7,8}
        };
        int[][]resultado = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = 0;
                for(int k = 0; k<2;k++){
                    resultado[i][k] +=matriz1[i][k] * matriz2[k][j];
                }
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = 0;
                for(int k = 0; k<2;k++){
                    System.out.println(resultado[i][k]);
                }
            }
        }
    }
}