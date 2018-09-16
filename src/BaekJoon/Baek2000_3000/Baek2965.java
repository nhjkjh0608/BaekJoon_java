package BaekJoon.Baek2000_3000;

import java.util.Scanner;

public class Baek2965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B = sc. nextInt();
        int C = sc.nextInt();
        int D = Math.max(B-A,C-B);
        System.out.println(D-1);
    }
}
