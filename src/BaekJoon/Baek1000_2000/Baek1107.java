package BaekJoon.Baek1000_2000;

import java.util.Arrays;
import java.util.Scanner;

public class Baek1107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int remote = sc.nextInt();
        int N = sc.nextInt();
        boolean[] arr = new boolean[10];
        Arrays.fill(arr,true);
        while(N-->0){
            arr[sc.nextInt()] = false;
        }
        int ans = Math.abs(remote-100);
        for(int i = 0; i<=888888; i++){
            boolean check = true;
            String changed = String.valueOf(i);
            int len = changed.length();
            for(int j = 0; j<len; j++){
                if(!arr[changed.charAt(j)-'0']){
                    check =false;
                    break;
                }
            }
            if(check){
                ans = Math.min(ans, len+Math.abs(i-remote));
            }

        }
        System.out.println(ans);
    }
}
