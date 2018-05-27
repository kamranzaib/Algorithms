package Matrix;

import java.util.Scanner;

public class MartrixArray {

    Scanner scan;
    int matrix[][];
    int row, column;

    void create() {

        scan = new Scanner(System.in);

        System.out.println("Matrix Creation");

        System.out.println("\nEnter number of rows :");
        row = Integer.parseInt(scan.nextLine());

        System.out.println("Enter number of columns :");
        column = Integer.parseInt(scan.nextLine());

        matrix = new int[row][column];
        System.out.println("Enter the data :");

        for(int i=0; i<row; i++) {

            for(int j=0; j<column; j++) {

                matrix[i][j] = scan.nextInt();
            }
        }
    }

    void display() {

        System.out.println("\nThe Matrix is :");

        for(int i=0; i<row; i++) {

            for(int j=0; j<column; j++) {

                System.out.print("\t" + matrix[i][j]);
            }
            System.out.println();
        }
    }
    private static int calculateDiagonalDifference(int[][] arr) {
        int len = arr.length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        int index = 0;
        while(index < len) {
            leftDiagonalSum += arr[index][index];
            rightDiagonalSum += arr[index][len-1-index];
            index++;
        }

        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        System.out.println(calculateDiagonalDifference(arr));
    }

}

class MainClass {

    public static void main(String args[]) {

        MartrixArray obj = new MartrixArray();

        obj.create();
        obj.display();
    }
}

