package BaekJoon.Baek9000_10000;

/**
 * Created by 김재현 on 2017-07-20.
 */

import java.io.*;
import java.util.ArrayList;

public class Baek9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        ArrayList<String> answer = new ArrayList<>();
        Loop1:for(int i = 0 ; i<caseNum;i++){
            int a  = 0;
            char[] Chararr = br.readLine().toCharArray();
            if(Chararr.length%2==1){
                answer.add("NO");
                continue;
            }
            for(char k: Chararr){
                if(k == '('){
                    a++;
                }else{
                    if(a ==0){
                        answer.add("NO");
                        continue Loop1;
                    }else{
                        a--;
                    }
                }
            }
            if(a==0){
                answer.add("YES");
            }else {
                answer.add("NO");
            }
        }
        for(String kk: answer){
            System.out.println(kk);
        }
    }
}
