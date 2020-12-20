package se.lexicon.asha;

public class exercise12 {


    static void printPrincipalDiagonal(int[][] matrix, int n)

    {
        System.out.print("Diagonal numbers of the 3x3 matrix array are: ");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println();
    }


    public static void main(String[] args)
    {
        int n = 3;
        int[][] a;
        a = new int [][] {{ 1, 2, 3 },
                          { 2, 4, 6 },
                          { 3, 6, 9 }};

        printPrincipalDiagonal(a, n);

    }
}
