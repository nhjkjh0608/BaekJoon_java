package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-12.
 */
import java.util.Scanner;
public class Baek1193 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Num = sc.nextInt();
        int check = 2;
        int caseNum = 1;
        int start = 1;
        while (start<Num){
            start += check;
            caseNum++;
            check +=1;
        }
        int Start = 1;
        int End = caseNum;
        int qqqq = caseNum;
        caseNum = caseNum*(caseNum-1)/2;
        if(caseNum+1!=Num &&caseNum != Num){
            while(caseNum+1!=Num){
                Start ++;
                End --;
                caseNum ++;
            }
        }
        if(qqqq%2==1){
            int tmp = End;
            End = Start;
            Start = tmp;
        }
        System.out.printf("%d/%d",Start,End);
    }
}
