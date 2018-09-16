package BaekJoon;

/**
 * Created by 김재현 on 2017-07-22.
 */
import java.io.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek5430 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Loop1:for(int i = 0; i<N; i++){
            char[] order = br.readLine().toCharArray();
            String q = br.readLine();
            Deque<Integer> list = new LinkedList<>();

            StringBuilder sb = new StringBuilder(br.readLine());
            String a = sb.substring(1,sb.length()-1);

            StringTokenizer Tok = new StringTokenizer(a,",");
            while(Tok.hasMoreTokens()){
                list.add(Integer.parseInt(Tok.nextToken()));
            }
            StringBuffer out = new StringBuffer("[");
            boolean reversed = false;
            for(char Char: order){
                    if(Char =='D'){
                        if(list.size()==0){
                            bw.write("error\n");
                            continue Loop1;
                        }else{
                            if(reversed){
                                list.pollLast();
                            }else{
                                list.pollFirst();
                            }

                        }
                    }else{
                        reversed = !reversed;
                    }
            }
            if(reversed){
                while(!list.isEmpty()){
                    out.append(list.pollLast());
                    out.append(',');
                }
            }else{
                while(!list.isEmpty()){
                    out.append(list.pollFirst());
                    out.append(',');
                }
            }

            for(int qq : list){
                out.append(qq);
                out.append(',');
            }

            if(out.length()!=1) {
                out.replace(out.length() - 1, out.length(), "]");
            }else{
                out.append(']');
            }
            bw.write(out+"\n");

        }
        bw.close();
    }
}
