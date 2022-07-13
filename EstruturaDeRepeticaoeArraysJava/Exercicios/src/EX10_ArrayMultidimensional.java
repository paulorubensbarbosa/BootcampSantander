import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */
public class EX10_ArrayMultidimensional {
	
	Random random = new Random();

	int[][] M = new int[3][3];

    for(int i = 0; i < M.length; i++) {
        for( int j = 0; j < M[i].length; j++) {
            M[i][j] = random.nextInt(9);
        }
    }

    System.out.println("Matriz: ");
    for (int[] linha : M  ) {
        for (int coluna : linha ) {
            System.out.print(coluna + " ");
        }
        System.out.println();
    }

}
	

}
