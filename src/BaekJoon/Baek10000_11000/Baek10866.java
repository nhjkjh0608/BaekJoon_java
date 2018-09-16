package BaekJoon.Baek10000_11000;

/**
 *
 * Created by 김재현 on 2017-07-22.
 */
import java.util.*;
import java.io.*;
public class Baek10866 {
    public static void main(String[] args) throws  IOException {
        Deque<Integer> dq = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i= 0; i<N;i++){
            String[] arr = br.readLine().split(" ");
            if(arr.length==2){
                int k = Integer.parseInt(arr[1]);
                switch (arr[0]){
                    case "push_back":
                        dq.addLast(k);
                        break;
                    case "push_front":
                        dq.addFirst(k);
                        break;
                    default:
                        break;
                }
            }else{
                switch (arr[0]){
                    case "front":
                        if(dq.size()==0){
                            bw.write(-1+"\n");
                        }else{
                            bw.write(dq.peekFirst()+"\n");
                        }
                        break;
                    case "pop_front":
                        if(dq.size()==0){
                            bw.write(-1+"\n");
                        }else{
                            bw.write(dq.pollFirst()+"\n");
                        }
                        break;
                    case "empty":
                        if(dq.isEmpty()){
                            bw.write(1+"\n");
                        }else{
                            bw.write(0+"\n");
                        }
                        break;
                    case "size":
                        bw.write(dq.size()+"\n");
                        break;
                    case "back":
                        if(dq.size()==0){
                            bw.write(-1+"\n");
                        }else{
                            bw.write(dq.peekLast()+"\n");
                        }
                        break;
                    case "pop_back":
                        if(dq.size() ==0){
                            bw.write(-1+"\n");
                        }else{
                            bw.write(dq.pollLast()+"\n");
                        }

                }
            }
        }
        bw.close();
    }
}
