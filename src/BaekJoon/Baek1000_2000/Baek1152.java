package BaekJoon.Baek1000_2000;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by 김재현 on 2017-07-11.
 */
public class Baek1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        StringTokenizer Tok = new StringTokenizer(k," ");
        System.out.println(Tok.countTokens());
    }
}
