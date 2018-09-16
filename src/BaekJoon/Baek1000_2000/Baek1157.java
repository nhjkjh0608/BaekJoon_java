package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] upperchar = sc.nextLine().toUpperCase().toCharArray();
        sc.close();
        int []arr  = new int[26];
        for(char a: upperchar){
            arr[a -65]+=1;
        }
        boolean Max = false;
        int Maxint = 0;
        int index = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]>Maxint){
                index = i;
                Maxint = arr[i];
                Max = false;
            }else if(arr[i]== Maxint){
                Max = true;
            }
        }

        if(Max){
            System.out.println('?');
        }else{
            System.out.println((char)(index+65));
        }


    }
}
