import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        Random r = new Random();

        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = r.nextInt(10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");

        for(int i = 0; i<matriz.length; i++){
            System.out.println(matriz[i][i]);
        }
    }
}
