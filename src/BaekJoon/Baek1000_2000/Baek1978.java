package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-17.
 */
import java.io.*;
import java.util.*;
public class Baek1978 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> primeNumber = new ArrayList<>();
        primeNumber.add(2);
        primeNumber.add(3);
        int caseNum = sc.nextInt();
        int output = 0;
        for(int k =0; k<caseNum;k++){
            int tmp = sc.nextInt();
            if(tmp ==1){
                continue;
            }
            if(primeNumber.contains(tmp)){
                output+=1;
                continue;
            }
            int standard = primeNumber.get(primeNumber.size()-1);
            Loop1:for(int i =standard+1; i<=tmp; i++){
                int standard2 = primeNumber.size();
                for(int j =0; j<standard2;j++){
                    if (i%primeNumber.get(j)==0){
                        continue Loop1;
                    }
                }
                primeNumber.add(i);
            }
            if(primeNumber.contains(tmp)){
                output+=1;
                continue;
            }

        }
        System.out.println(output);

    }

}
