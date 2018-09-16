package BaekJoon.Baek6000_7000;

/**
 * Created by 김재현 on 2017-07-16.
 */
import java.util.Scanner;
public class Baek6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int [] ouputArr = new int[caseNum];

        for(int i = 0; i<caseNum;i++){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int MN = lcm(M,N);
            while(x!= y && x<=MN){
                if(x<y){ x+=M;}
                else{ y+=N;}
            }
            if(x!=y){ouputArr[i] = -1;}
            else{ouputArr[i] = x;}
        }



        for(int i : ouputArr){
            System.out.println(i);
        }
    }
    public static int lcm(int m, int n){
        int z;
        int a = m;
        int b = n;
        while(true){
            z = a%b;
            if(z==0){
                break;
            }
            a = b;
            b =z;
        }
        return (m*n)/b;
    }
}
