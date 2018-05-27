package Matrix;

import java.util.Scanner;

public class plus_minus {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        double positive = 0;
        double negative = 0;
        double zero = 0;
        int n;

        System.out.println("enter number of elements in array:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("enter all the elements:");
        for(int i = 0; i<n; i++)
        {
            int value = in.nextInt();
            positive += value>0 ? 1:0;
            negative += value<0 ? 1:0;
            zero     += value==0 ?1:0;
        }
        System.out.println(positive/n);
        System.out.println(negative/n);
        System.out.println(zero/n);
    }
    }
