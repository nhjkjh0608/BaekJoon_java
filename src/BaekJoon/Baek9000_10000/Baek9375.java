package BaekJoon.Baek9000_10000;
import java.util.*;
import java.io.*;
public class Baek9375 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            int N1 = Integer.parseInt(br.readLine());
            HashMap<String,Integer> map = new HashMap<>();
            while(N1-->0){
                StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
                String a = Tok.nextToken();
                String b = Tok.nextToken();
                if(map.get(b)==null){
                    map.put(b,1);
                }else{
                    int QQ = map.get(b);
                    QQ+=1;
                    map.put(b,QQ);
                }

            }
            int out =1;
            for(int val: map.values()){
                out*=(val+1);
            }
            System.out.println(out-1);

        }
    }
}
