package Ilkpaket;

public class MatrisTranspoz {
    public static void main(String[] args) {

        int[][] A={{2,3,4},
                   {1,5,7}};

        int B[][]=new int[3][2];

        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                B[i][j]=A[j][i];

            }

        }
        for (int i=0;i<3;i++){
            System.out.println(" ");
            for (int j=0; j<2;j++){
                System.out.print(B[i][j] + " ");
            }
        }

    }
}
