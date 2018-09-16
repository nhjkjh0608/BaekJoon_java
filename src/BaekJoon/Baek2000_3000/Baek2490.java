package BaekJoon.Baek2000_3000;

import java.io.*;
import java.util.StringTokenizer;

public class Baek2490 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i =0; i<3;i++){
            int a =0;
            StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
            String b = "1";
            while(Tok.hasMoreTokens()){
                if(b.equals(Tok.nextToken())){
                    a++;
                }
            }
            switch (a){
                case 0:
                    System.out.println('D');
                    break;
                case 1:
                    System.out.println('C');
                    break;
                case 2:
                    System.out.println('B');
                    break;
                case 3:
                    System.out.println('A');
                    break;
                case 4:
                    System.out.println('E');
                    break;
                default:
                    break;
            }
        }
    }
}
