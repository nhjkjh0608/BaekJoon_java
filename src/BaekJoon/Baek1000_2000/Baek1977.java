package BaekJoon.Baek1000_2000;

import java.util.Scanner;

public class Baek1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sqrtM = (int)Math.sqrt(M);
        int sqrtN = (int)Math.sqrt(N)+1;

        boolean exists = true;
        long sum = 0;
        int min = 0;
        int checkValue = (sqrtM)*(sqrtM);
        if(checkValue<M ||checkValue>N){
            int check2 = (sqrtM+1)*(sqrtM+1);
            if(check2<M||check2>N){
                exists = false;
            }else{
                min = check2;
            }
        }else{
            min = checkValue;
        }
        for(int i = sqrtM;i<=sqrtN; i++ ){
            int tmp = i*i;
            if(M<=tmp&&tmp<=N){
                sum+= tmp;
            }
        }

        if(exists){
            System.out.println(sum);
            System.out.println(min);
        }else{
            System.out.println(-1);
        }
    }
}
