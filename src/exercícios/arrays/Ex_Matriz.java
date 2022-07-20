package exercícios.arrays;

import java.util.Random;

public class Ex_Matriz {
    public static void main(String[] args) {
        Random random = new Random();

        int [][] N = new int[4][4];

        for(int i =0; i < N.length; i++) {
            for(int j = 0; j < N[i].length; j++) {
                N[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for(int[] linha : N) {
            for(int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
