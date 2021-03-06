package BaekJoon.Baek2000_3000;

import java.util.Scanner;

/**
 * Created by 김재현 on 2017-07-11.
 */
public class Baek2448 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n, k, m;
        int i, j;
        String[] arr;
        int copyHeight;
        n = scanner.nextInt();
        k = (int) (Math.log(n / 3) / Math.log(2)) + 1;
        arr = new String[n];
        arr[0] = "  *  ";
        arr[1] = " * * ";
        arr[2] = "*****";
        copyHeight = 3;
        for(i = 1 ; i < k ; i++) {
            for(j = 0 ; j < copyHeight ; j++) {
                arr[copyHeight + j] = arr[j] + " " + arr[j];
                for(m = 0 ; m < copyHeight / 3 ; m++) {
                    arr[j] = "   " + arr[j] + "   ";
                }
            }
            copyHeight = copyHeight + copyHeight;
        }

        for(i = 0 ; i < copyHeight ; i++) {
            System.out.println(arr[i]);
        }
    }
}
