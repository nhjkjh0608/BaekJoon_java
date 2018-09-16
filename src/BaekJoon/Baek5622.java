package BaekJoon;

/**
 * Created by 김재현 on 2017-07-12.
 */
import java.util.Scanner;
public class Baek5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char []tmp = sc.nextLine().toCharArray();
        int k =0;
        for(char I: tmp){
            k+= check(I);
        }
        System.out.println(k);
    }
    public static int check(char k){
        switch (k){
            case 'A':
            case 'B':
            case 'C':
                return 3;
            case 'D':
            case 'E':
            case 'F':
                return 4;
            case 'G':
            case 'H':
            case  'I':
                return 5;
            case 'J':
            case 'K':
            case 'L':
                return 6;
            case 'M':
            case 'N':
            case 'O':
                return 7;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 8;
            case 'T':
            case 'U':
            case 'V':
                return 9;
            default:
                return 10;
        }
    }
}
