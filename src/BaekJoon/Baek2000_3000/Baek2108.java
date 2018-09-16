package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-17.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Baek2108 {
    public static void main(String[] args) throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8001];
        long sum = 0;
        int caseNum = Integer.valueOf(br.readLine());
        int[] number = new int[caseNum];

        int max  = 0;
        int max_1 = -1;

        for(int i =0; i<caseNum;i++){
            number[i] = Integer.valueOf(br.readLine());
            sum+= number[i];
            arr[number[i]+4000]++;
        }

        Arrays.sort(number);

        for(int i =arr.length-1; i>=0;i--){
            if(arr[max]<=arr[i]){
                max_1 = max;
                max = i;
            }
        }
        double tmp = (double)sum/caseNum;
        System.out.println(Math.round(tmp));
        System.out.println(number[(int)(caseNum/2)]);
        if(arr[max]==arr[max_1]){
            System.out.println(max_1 - 4000);
        }else{
            System.out.println(max-4000);
        }
        System.out.println(number[caseNum-1]-number[0]);
    }
}
