package BaekJoon.Baek1000_2000;

import java.io.*;
import java.util.*;
public class Baek1024 {
    static int FIrst=0;
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(Tok.nextToken());
        int L = Integer.parseInt(Tok.nextToken());
        boolean Check = check(N,L);

        while(!Check&&L<=100){
            L++;
            Check = check(N,L);
        }
        if(L>100){
            System.out.println(-1);;
        }else {
            StringBuffer bf = new StringBuffer("");
            int first = FIrst;
            while(L-->1){
                bf.append(first+" ");
                first++;
            }
            bf.append(first);
            System.out.println(bf.toString());
        }





    }
    static boolean check(int N, int L){
        if(L%2 ==1){
            if(N%L ==0){
                int tmp = (N/L) - (L/2);
                if(tmp>=0){
                    FIrst = tmp;
                    return true;
                }else{
                    return false;
                }
            }else{return false;}
        }else{
            int k = L/2;
            if(N%2 ==0){
                if(N%k != 0){
                    return false;
                }else{
                    int divided = N/k;
                    if(divided%2 ==1){
                        int tmp = divided/2 - (k-1);

                        if(tmp>=0){
                            FIrst = tmp;
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return false;
                    }

                }
            }else{
                if(N%k !=0){
                    return false;
                }else{
                    int tmp = (N/k)/2 - (k-1);
                    if(tmp>=0){
                        FIrst = tmp;
                        return true;
                    }else{
                        return false;
                    }
                }
            }

        }
    }
}
