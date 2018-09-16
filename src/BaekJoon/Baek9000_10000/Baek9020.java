package BaekJoon.Baek9000_10000;

/**
 * Created by 김재현 on 2017-07-18.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Baek9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = sc.nextInt();
        ArrayList<Integer> primeNumber = new ArrayList<>();
        primeNumber.add(2);
        primeNumber.add(3);
        Loop1:for(int i =5; i<=9999; i+=2){
            int standard2 = primeNumber.size();
            for(int j =0; j<standard2;j++){
                if (i%primeNumber.get(j)==0){
                    continue Loop1;
                }
                if(primeNumber.get(j)>Math.ceil(Math.sqrt(i))){
                    break ;
                }
            }
            primeNumber.add(i);
        }
        ArrayList<String > ou = new ArrayList<>();
        int Size = primeNumber.size();
        for(int i = 0; i<caseNum;i++){
            int Num = sc.nextInt();
            String string= "";
            int difference = Num;
            int k =0;
            for(int j =0; j<Size;j++){
                if(primeNumber.get(j)>((Num+1)/2)){
                    break;
                }
                int ccc = primeNumber.get(j);
                if(primeNumber.contains(Num-ccc)){
                    if((Num -2*ccc)<difference){
                        k = ccc;
                    }
                }
            }
            string += String.valueOf(k);
            string+=" ";
            string+= String.valueOf(Num-k);
            ou.add(string);
        }
        for(String k: ou){
            System.out.println(k);
        }

    }
}
