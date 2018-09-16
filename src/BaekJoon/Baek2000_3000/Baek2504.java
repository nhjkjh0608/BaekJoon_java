package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-20.
 */
import java.util.*;
public class Baek2504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String list = sc.nextLine();
        int sum =0;
        int multi = 1;
        int a=0;
        int b = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<list.length();i++) {
            char Ch = list.charAt(i);
            if (Ch == '(') {
                multi *= 2;
                a++;
                stack.push(Ch);
                if (i + 1 < list.length() && list.charAt(i + 1) == ')') {
                    sum += multi;
                }
            } else if (Ch == '[') {
                multi *= 3;
                b++;
                stack.push(Ch);
                if (i + 1 < list.length() && list.charAt(i + 1) == ']') {
                    sum += multi;
                }
            } else if (Ch == ')') {
                multi /= 2;
                a--;
                stack.pop();
            } else if (Ch == ']') {
                multi /= 3;
                b--;
                stack.pop();

            }
        }
        if(!stack.empty()||a!= 0|| b!=0){
            sum =0;
        }
        System.out.println(sum);

    }
}
