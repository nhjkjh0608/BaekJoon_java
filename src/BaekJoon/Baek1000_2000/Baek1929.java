package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-18.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Baek1929 {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumber = new ArrayList<>();
        primeNumber.add(2);
        primeNumber.add(3);
        int standard = primeNumber.get(primeNumber.size()-1);
        Loop1:for(int i =standard+1; i<=1000000; i++){
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
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        Iterator<Integer> iterator = primeNumber.iterator();

        while(iterator.hasNext()){
            int k = iterator.next();
            if(M<=k &&k<=N ){
                System.out.println(k);
            }else if(k>N){
                break;
            }
        }

    }
}

