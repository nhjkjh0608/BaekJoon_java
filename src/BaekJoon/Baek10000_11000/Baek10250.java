package BaekJoon.Baek10000_11000;

/**
 * Created by 김재현 on 2017-07-13.
 */

import java.util.Scanner;
import java.text.DecimalFormat;
public class Baek10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        int [] arr = new int[Case];
        String [] arr1 = new String[Case];

        for(int i = 0; i< Case;i++){
            int H  = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            DecimalFormat df = new DecimalFormat("00");
            int qq = 1;

            while(N>H){
                N-= H;
                qq++;
            }
            arr[i] = N;
            arr1[i] = df.format(qq);
        }
        for(int i = 0; i<Case;i++){
            System.out.println(arr[i]+arr1[i]);
        }
    }
}
