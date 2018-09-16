package BaekJoon.Baek6000_7000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek6236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]tmp = sc.nextLine().split(" ");
        int day = Integer.parseInt(tmp[0]);
        int number = Integer.parseInt(tmp[1]);
        int [] moneyList = new int[day];
        int maxfromList=0;
        int sum = 0;
        for(int i = 0; i<day;i ++){
            moneyList[i] = sc.nextInt();
            sum += moneyList[i];
            maxfromList = Math.max(maxfromList,moneyList[i]);
        }
        int first_minimum =Math.max(maxfromList,Math.round(sum/day));
        int first_maximum = sum;
        while(first_maximum- first_minimum!=1 && first_maximum != first_minimum){
            int standard = (first_maximum+ first_minimum)/2;
            if(possibility(moneyList,standard,number)){
                first_maximum = standard;

            }else{
                first_minimum = standard;
            }
        }
        if(possibility(moneyList,first_minimum,number)){
            System.out.println(first_minimum);
        }else {
            System.out.println(first_maximum);
        }
    }
    static boolean possibility( int[]moneyList, int value, int number){
        int check = 1;
        int tmp = value;
        for(int i =0; i<moneyList.length;i++ ){
            if(tmp>= moneyList[i]){
                tmp -= moneyList[i];
            }else{
                tmp = value;
                check +=1;
                tmp -= moneyList[i];
            }
        }
        if(check>number){
            return false;
        }else{
            return true;
        }
    }
}
