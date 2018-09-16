package BaekJoon.Baek1000_2000;

import java.util.Scanner;
public class Baek1676 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Out =0;
        int N = sc.nextInt();
        for(int i= 1; i<=N; i++){
            if(i%5==0){
                Out +=1;
                if(i%25==0){
                    Out+=1;
                    if(i%125 ==0){
                        Out+=1;
                    }
                }
            }
        }
        System.out.println(Out);

    }
}
