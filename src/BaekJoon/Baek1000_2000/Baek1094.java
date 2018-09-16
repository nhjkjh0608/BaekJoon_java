package BaekJoon.Baek1000_2000;

import java.util.Scanner;

public class Baek1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int out = 0;
        while(A!=0){
            if(A%2==1){
                out ++;
            }
            A/=2;
        }
        System.out.println(out);
    }
}
