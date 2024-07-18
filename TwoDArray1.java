//Print the spiral order matrix as output for a given matrix of numbers. [Difficult for Beginners]

import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Spiral Matrix is: ");

        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;
        
        //rowStart      rowEnd
        //   1      2      3    colStart
        //   4      5      6
        //   7      8      9     colEnd

    while(rowStart <= rowEnd && colStart <= colEnd){

        //1
            for(cols=colStart; cols<=colEnd; cols++){
                System.out.print(matrix[rowStart][cols] + " ");
            }
            rowStart++;

        //2
            for(rows=rowStart; rows<=rowEnd; rows++){
                System.out.print(matrix[rows][colEnd] + " ");
            }
            colEnd--;

        //3
            for(cols=colEnd; cols>=colStart; cols--){
                System.out.print(matrix[rowEnd][cols] + " ");
            }
            rowEnd--;
 
        //4
            for(rows=rowEnd; rows>=rowStart; rows--){
                System.out.print(matrix[rows][colStart] + " ");
            }
            colStart++;

    }

        System.out.println();
    }
}
