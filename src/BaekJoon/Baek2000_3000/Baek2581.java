package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-18.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Baek2581 {
    public static void main(String[] args) {
        ArrayList<Integer> primeNumber = new ArrayList<>();
        primeNumber.add(2);
        primeNumber.add(3);
        int standard = primeNumber.get(primeNumber.size()-1);
        Loop1:for(int i =standard+1; i<=10000; i++){
            int standard2 = primeNumber.size();
            for(int j =0; j<standard2;j++){
                if (i%primeNumber.get(j)==0){
                    continue Loop1;
                }
            }
            primeNumber.add(i);
        }
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        Iterator<Integer> iterator = primeNumber.iterator();
        boolean found = false;
        ArrayList<Integer> tmplist = new ArrayList<>();
        int sum = 0;
        while(iterator.hasNext()){
            int k = iterator.next();
            if(M<=k &&k<=N ){
                tmplist.add(k);
            }else if(k>N){
                break;
            }
        }
        for(int i: tmplist){
            sum+= i;
        }
        if(tmplist.size()==0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(tmplist.get(0));
        }


    }
}
