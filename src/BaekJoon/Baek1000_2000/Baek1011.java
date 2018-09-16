package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-12.
 */
import java.util.Scanner;
public class Baek1011 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int Case = sc.nextInt();
        int[] arr = new int[Case];
        for(int i = 0; i<Case;i++){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int distance = a2 -a1;
            int check = (int)Math.sqrt(distance);
            int check2 = check*check;
            if(distance == check2){
                arr[i] = 2*(check-1)+1;

            }else if(distance<=check2+check){
                arr[i] = 2*(check);
            }else{
                arr[i] = 2*(check)+1;
            }
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
