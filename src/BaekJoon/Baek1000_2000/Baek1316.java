package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-12.
 */
import java.util.Arrays;
import java.util.Scanner;
public class Baek1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int NUM = 0;
        boolean [] bools = new boolean[26];
        Arrays.fill(bools,false);
        Loop1: for(int i = 0 ;i<num; i++){
            char[] check = sc.nextLine().toCharArray();
            char before = ' ';
            for(char c:check){
                if(bools[c-97]==false){
                    bools[c-97]= true;
                    before = c;
                }else{
                    if(before == c){
                        continue;
                    }else{
                        Arrays.fill(bools,false);
                        continue Loop1;
                    }
                }
            }
            NUM +=1;
            Arrays.fill(bools,false);
        }
        System.out.println(NUM);
    }
}
