package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-12.
 */

import java.util.*;

public class Baek2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]arr = sc.nextLine().split(" ");


        int reverse1 = Integer.parseInt(new StringBuilder(new String(arr[0])).reverse().toString());

        int reverse2 = Integer.parseInt(new StringBuilder(new String(arr[1])).reverse().toString());
        System.out.println((reverse1<reverse2)?reverse2:reverse1);

    }
}
