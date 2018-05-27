package Matrix;

import java.util.Scanner;

public class sumOfArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("enter number of elements in array:");
        n = in.nextInt();
        int a[] = new int [n];
        System.out.println("enter all the elements:");
        for(int i = 0; i<n; i++){
            a[i]=in.nextInt();
            sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
