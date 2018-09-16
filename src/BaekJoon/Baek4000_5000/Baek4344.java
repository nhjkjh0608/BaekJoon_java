package BaekJoon.Baek4000_5000; /**
 * Created by 김재현 on 2017-07-10.
 */
import java.util.Scanner;
public class Baek4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        double []Arr = new double [caseNum];
        for (int i = 0; i<caseNum; i++){
            int length = sc.nextInt();
            int [] tmparr = new int[length];
            int sum = 0;
            for(int j =0; j<length ; j++){
                int tmp =sc.nextInt();
                sum += tmp;
                tmparr[j] = tmp;
            }
            double average = (sum+0.0)/length;
            int number = 0;
            for(int j: tmparr){
                if(j>average){
                    number+=1;
                }
            }
            Arr[i] = (number+0.0)*100/length;

        }
        for(double k : Arr){
            System.out.printf("%.3f%%\n",k);
        }
    }

}
