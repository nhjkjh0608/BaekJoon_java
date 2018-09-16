package BaekJoon.Baek1000_2000;

import java.util.Scanner;

public class Baek1057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.max(a,b);
        int d = Math.min(a,b);
        int S = 1;
        while(!(c==d+1 &&d%2==1)){
            c= (c+1)/2;

            d = (d+1)/2;

            S++;
        }
        System.out.println(S);
    }
}
