package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-20.
 */

import java.util.*;
import java.io.*;
public class Baek1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list  = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N;i++){
            list.clear();
            StringTokenizer Tok = new StringTokenizer(br.readLine(), " ");
            String a =Tok.nextToken();
            Integer index = Integer.parseInt(Tok.nextToken());

            Queue<Integer> q = new LinkedList<>();

            StringTokenizer Tok1 = new StringTokenizer(br.readLine()," ");
            while(Tok1.hasMoreTokens()){
                int k = Integer.parseInt(Tok1.nextToken());
                list.add(k);
                q.add(k);
            }
            Collections.sort(list);
            int second;
            int LoopNum = 0;
            while(true){
                int now =q.poll();


                second = list.get(list.size()-1);

                if(now ==second){
                    LoopNum++;
                    list.remove(list.size()-1);
                    if(index ==0){
                        break;
                    }else{
                        index--;
                    }
                    continue;
                }else{
                    q.add(now);
                    if(index ==0){
                        index = q.size()-1;
                    }else{
                        index--;
                    }
                }
            }
            System.out.println(LoopNum);

        }
    }

}
