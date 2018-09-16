package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek1002 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int caseNum = sc.nextInt();
        int [] result = new int[caseNum];

        for(int i = 0; i<caseNum; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            double distance = distance(x1,y1,x2,y2);
            if(x1 == x2 && y1 == y2 && r1 == r2){
                result[i] = -1;
                continue;
            }
            if(distance == r1+ r2 || Math.max(r1,r2) == distance+Math.min(r1,r2)){
                result[i] = 1;
                continue;
            }
            if(distance > r1+r2){
                result[i] = 0;
                continue;
            }
            if ( Math.max(r1,r2)>distance+Math.min(r1,r2)){
                result[i] = 0;
                continue;
            }
            if(Math.max(r1,r2)<distance+Math.min(r1,r2)) {
                result[i] = 2;
                continue;
            }
        }
        for(int i: result){
            System.out.println(i);
        }


    }
    static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

}
