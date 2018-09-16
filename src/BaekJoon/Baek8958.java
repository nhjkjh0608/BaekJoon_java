package BaekJoon;

/**
 * Created by 김재현 on 2017-07-11.
 */
import java.util.Scanner;
public class Baek8958 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int Case = Integer.parseInt(sc.nextLine());
        int result[] = new int [Case];
        for(int i =0 ; i<Case;i++){
            char [] arr = sc.nextLine().toCharArray();
            int Onum =0;
            int Xnum = 0;
            int sum =0;
            for(char k: arr){
                if(k=='O'){
                    Onum+=1;
                    sum+= Onum;
                }else{
                    Onum = 0;
                }
            }
            result[i] = sum;
        }
        for(int k : result){
            System.out.println(k);
        }
    }
}
