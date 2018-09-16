package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[8];
        for(int i = 0; i<8; i++){
            arr[i]= sc.nextInt();
        }
        boolean assend = false;
        boolean desend = false;
        boolean mixed = false;
        for(int i = 0; i<7; i++){
            if(arr[i]<arr[i+1]){
                if(desend){
                    mixed = true;
                    break;
                }else{
                    assend = true;
                }
            }else{
                if(assend){
                    mixed = true;
                    break;
                }else{
                    desend = true;
                }
            }
        }
        if(mixed){
            System.out.println("mixed");
        }else{
            if(assend){
                System.out.println("ascending");
            }else{
                System.out.println("descending");
            }
        }

    }
}
