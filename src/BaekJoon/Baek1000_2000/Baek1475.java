package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-16.
 */
import java.util.Scanner;
public class Baek1475 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[]arr = new int[10];
        char[] tmp = sc.nextLine().toCharArray();
        for(char Char:tmp){
            arr[Char - 48]+= 1;
        }
        int check = (arr[6]+arr[9]+1)/2;
        for(int i = 0; i<10; i++){
            if(i ==6||i == 9){
                continue;
            }
            check = Math.max(check,arr[i]);

        }
        System.out.println(check);
    }
}
