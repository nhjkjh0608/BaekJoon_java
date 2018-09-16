package BaekJoon.Baek2000_3000;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.*;
public class Baek2981 {
    static LinkedList<Integer> list = new LinkedList<>();
    static Stack<Integer> list2 = new Stack<>();
    public static void main(String[] args)throws  IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i =0; i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int NN = arr[N-1]- arr[0];
        divider(NN);

        while(!list.isEmpty()){
            boolean add = true;
            int n = list.poll();
            int mod = arr[0]%n;
            for(int i:arr){
                if(i%n!=mod){
                    add = false;
                    break;
                }
            }
            if(add){bw.write(String.valueOf(n)+" ");}
        }
        while(!list2.isEmpty()){
            boolean add = true;
            int n = list2.pop();
            int mod  = arr[0]%n;
            for(int i: arr){
                if(i%n!=mod){
                    add = false;
                    break;
                }
            }
            if(add){bw.write(String.valueOf(n)+" ");}
        }
        bw.flush();



    }
    static void divider(int N){
        double sqrt = Math.sqrt(N);

        list2.add(N);
        if(sqrt-5<=0){

            for(int i =2; i<=sqrt; i++){
                if(N%i ==0){
                    if(N/i==i){
                        list.add(i);
                    }else{
                        list.add(i);
                        list2.add(N/i);
                    }
                }
            }
        }else{
            for(int i = 2; i<(int)(sqrt-2);i++){
                list.add(i);
                list2.add(N/i);
            }
            for(int i = (int)(sqrt-2); i<=sqrt;i++){
                if(N%i ==0){
                    if(N/i==i){
                        list.add(i);
                    }else{
                        list.add(i);
                        list2.add(N/i);
                    }
                }
            }
        }

    }
}
