package Matrix;

import java.util.Scanner;

public class birthdayCandles {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n, tallest = 0, frequency = 0;
        System.out.println("enter number of candles in array:");
        n = in.nextInt();
        int a[] = new int[n];
        System.out.println("enter height of candles:");

        for(int i=0; i < n; i++){
            int height = in.nextInt();

            if(height > tallest){
                tallest = height;
                frequency = 1;
            }
            else if(height == tallest) frequency++;
        }
        System.out.println(frequency);
    }

    }
