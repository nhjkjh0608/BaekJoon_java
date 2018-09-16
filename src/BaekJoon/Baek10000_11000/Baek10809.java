package BaekJoon.Baek10000_11000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine();
        for(int i= 97 ; i<=122; i++){
            System.out.print(tmp.indexOf((char)i));
            System.out.print(" ");
        }
    }
}
