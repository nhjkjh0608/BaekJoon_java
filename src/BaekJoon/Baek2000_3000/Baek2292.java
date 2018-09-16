package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-12.
 */
import java.util.Scanner;
public class Baek2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int start = 1;
        int check = 6;
        int Num = 1;
        while(start<k){
            start += check;
            check += 6;
            Num +=1;
        }
        System.out.println(Num);
    }
}
