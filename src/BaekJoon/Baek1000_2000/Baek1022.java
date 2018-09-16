package BaekJoon.Baek1000_2000;
import java.util.*;
import java.io.*;
public class Baek1022 {
    public static void main(String[] args)throws IOException {
        int r1,c1,r2,c2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
        r1 = Integer.parseInt(Tok.nextToken());
        c1 = Integer.parseInt(Tok.nextToken());
        r2 = Integer.parseInt(Tok.nextToken());
        c2 = Integer.parseInt(Tok.nextToken());
        int Q;
        int Q1 = Math.max(get(r1,c1).length(),get(r1,c2).length());
        int Q2 = Math.max(get(r2,c1).length(),get(r2,c2).length());
        Q = Math.max(Q1,Q2);
        for(int i =r1;i<=r2;i++){
            StringBuilder bu = new StringBuilder("");
            for(int j = c1; j<c2;j++){
                String a = get(i,j);
                int tmp = Q- a.length();
                for(int k= 0; k<tmp;k++){
                    bu.append(" ");
                }
                bu.append(a+" ");
            }
            String a2 = get(i,c2);
            int tmp2 = Q-a2.length();
            for(int k2 =0; k2<tmp2;k2++){
                bu.append(" ");
            }
            bu.append(a2);
            System.out.println(bu);
        }


    }
    static String get(int r,int c){
        int all = Math.max(Math.abs(r),Math.abs(c));
        int all2 = (all*2+1)*(all*2+1);
        int k;
        if(r>=c){
            k = all*2-(r+c);
            return (all2-k)+"";

        }else{
            k = all*2-(r+c);
            int j = all*2*4;
            return (all2-j+k)+"";
        }
    }

}
