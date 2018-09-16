package BaekJoon.Baek4000_5000;

/**
 * Created by 김재현 on 2017-07-18.
 */
import java.util.*;
import java.io.*;
public class Baek4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> primeNumber = new ArrayList<>();
        primeNumber.add(2);
        primeNumber.add(3);
        Loop1:for(int i =5; i<=246912; i+=2){
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
        ArrayList<Integer> outputList = new ArrayList<>();
        while(true){
            int check = Integer.parseInt(bf.readLine());
            if(check == check*2){
                break;
            }
            int check2 = check*2;
            int kkkk =0;
            Iterator<Integer> iterator = primeNumber.iterator();
            while(iterator.hasNext()){
                int k =iterator.next();
                if(check<k &&k<=check2){
                    kkkk++;
                }
            }
            outputList.add(kkkk);
        }
        for(int i:outputList){
            System.out.println(i);
        }
    }
}
