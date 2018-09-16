package BaekJoon.Baek10000_11000;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by 김재현 on 2017-07-20.
 */

public class Baek10845 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        int back =0;
        for(int i =0; i<caseNum; i++){
            String[] arr = br.readLine().split(" ");
            if(arr.length ==2){
                q.offer(Integer.parseInt(arr[1]));
                back = Integer.parseInt(arr[1]);
                continue;
            }
            switch (arr[0]){
                case"front":
                    if(q.size()==0){
                        System.out.println(-1);
                    }else{
                        System.out.println(q.peek());
                    }
                    break;
                case"back":
                    if(q.size()==0){
                        System.out.println(-1);
                    }else{
                        System.out.println(back);
                    }
                    break;
                case "pop":
                    if(q.size()==0){
                        System.out.println(-1);
                    }else{
                        System.out.println(q.poll());
                    }
                    break;
                case "size":
                    if(q.size()==0){
                        System.out.println(0);
                    }else{
                        System.out.println(q.size());
                    }
                    break;
                case "empty":
                    if(q.isEmpty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
