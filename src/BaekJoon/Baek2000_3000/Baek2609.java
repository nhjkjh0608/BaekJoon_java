package BaekJoon.Baek2000_3000;

import java.util.Scanner;

public class Baek2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(a*b/gcd(a,b));
    }
    static int gcd(int a, int b){
        int mod = a%b;
        while(mod>0){
            a= b;
            b = mod;
            mod = a%b;
        }
        return b;
    }
}
