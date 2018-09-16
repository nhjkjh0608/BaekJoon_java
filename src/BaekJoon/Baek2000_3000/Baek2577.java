package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c  = sc.nextInt();
        int k = a*b*c;
        char[] arr = String.valueOf(k).toCharArray();
        int[] Arr = new int[10];
        for(char i: arr){
            Arr[i-48] +=1;
        }
        for(int i : Arr){
            System.out.println(i);
        }

    }
}
