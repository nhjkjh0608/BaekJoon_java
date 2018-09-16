package BaekJoon.Baek10000_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek10219 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(Tok.nextToken());
            int b = Integer.parseInt(Tok.nextToken());
            ArrayList<String> list = new ArrayList<>();
            while(a-->0){
                StringBuffer bf = new StringBuffer(br.readLine());
                bf.reverse();
                list.add(bf.toString());
            }
            for(String aa: list) {
                System.out.println(aa);
            }
        }

    }
}
