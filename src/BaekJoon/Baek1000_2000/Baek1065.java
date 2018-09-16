package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek1065 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int Length = sc.nextInt();
        int Number = 0;

        for(int i = 1; i<=Length;i++){
            char[] tmp = String.valueOf(i).toCharArray();
            if(tmp.length<3){
                Number += 1;
                continue;
            }else{
                int standard = tmp[1]- tmp[0];
                boolean check = true;
                for(int j = 1; j<tmp.length-1; j++){
                    int Tmp = tmp[j+1]- tmp[j];
                    if(Tmp != standard){
                        check = false;
                        break;
                    }
                }
                if(check){
                    Number+=1;
                }
            }
        }

        System.out.println(Number);
    }
}
