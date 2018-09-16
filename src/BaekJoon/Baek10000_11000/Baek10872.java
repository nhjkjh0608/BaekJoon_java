package BaekJoon.Baek10000_11000;

import java.util.*;
public class Baek10872 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        long a =1;
        for(int i=1 ; i<=N;i++){
            a*=i;
        }
        System.out.println(a);
    }
}
