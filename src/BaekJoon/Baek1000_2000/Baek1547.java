package BaekJoon.Baek1000_2000;

import java.util.Scanner;

public class Baek1547 {
    public static void main(String[] args) {
        boolean[] cup = new boolean[4];
        cup[1] = true;
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while(N-->0){
            String tmp = sc.nextLine();
            int a = tmp.charAt(0)-'0';
            int b = tmp.charAt(2)-'0';
            boolean t;
            t = cup[a];
            cup[a]= cup[b];
            cup[b] = t;
        }
        for(int i =0; i<cup.length;i++){
            if(cup[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
