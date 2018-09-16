package BaekJoon.Baek1000_2000; /**
 * Created by 김재현 on 2017-07-10.
 */
import java.util.Scanner;
public class Baek1110 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int j = step(k);
        int Step = 1;
        while(j != k){
            j  = step(j);
            Step+=1;
        }
        System.out.println(Step);


    }
    public static int step(int x){
        if(x<10){
            return x*10 + x;
        }else{
            return x%10 * 10 + (x%10 + x/10) %10;
        }
    }
}
