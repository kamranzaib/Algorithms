package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class min_max_value {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number");

        int n = in.nextInt();
        long [] a = new long [5];
        long sum = 0;

        for (int i=0; i<a.length; i++){
           long temp = in.nextInt();
           a[i] = temp;
           sum += temp;

        }

        Arrays.sort(a);
        System.out.println((sum - a[a.length-1])+" " + (sum -a[0] )  );

    }
}

