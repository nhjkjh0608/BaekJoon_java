package BaekJoon.Baek11000_12000;

/**
 * Created by 김재현 on 2017-07-22.
 */
import java.util.*;
public class Baek11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer Tok = new StringTokenizer(sc.nextLine()," ");
        int N = Integer.parseInt(Tok.nextToken());
        int M = Integer.parseInt(Tok.nextToken());
        Queue<Integer> q= new LinkedList<>();
        StringBuffer bf = new StringBuffer("<");
        for(int i = 1; i<=N;i++){
            q.add(i);
        }
        int a = 0;
        while(!q.isEmpty()){
            int b = q.poll();
            a++;
            if(a%M ==0){
                bf.append(b);
                bf.append(", ");
            }else{
                q.add(b);
            }
        }
        int length = bf.length();
        bf.replace(length-2,length,">");
        System.out.println(bf.toString());
    }
}
