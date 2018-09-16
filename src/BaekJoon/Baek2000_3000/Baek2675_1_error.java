package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek2675_1_error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Case = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < Case; i++) {
            int tmp = Integer.parseInt(sc.nextLine());
            String arr = sc.nextLine();
            String x = "";
            for (int j = 0; j < arr.length(); j++) {
                for (int k = 0; k < tmp; k++) {
                    x += arr.charAt(j);
                }
            }
            System.out.println(x);
        }
    }
}
