package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;

public class Baek7576 {

    public static void main(String[] args)throws IOException {
        int[] Xcord = {1,-1,0,0};
        int[] Ycord = {0,0,-1,1};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(Tok.nextToken());
        int M = Integer.parseInt(Tok.nextToken());
        int [][] apple = new int[M+2][N+2];
        int [][] days = new int[M+2][N+2];
        int totalApple = N*M;
        for(int i =0 ;i<M+2; i++){
        Arrays.fill(apple[i], -1);}
        int maxDays = 0;
        int filled =0;
        Queue<Node> Q = new LinkedList<>();
        for(int i= 0 ;i<M ; i++){
            int index = 1;
            Tok = new StringTokenizer(br.readLine());
            while(Tok.hasMoreTokens()){
                int now = apple[i+1][index] = Integer.parseInt(Tok.nextToken());
                if(now ==-1){totalApple--;}
                else if(now ==1){
                    filled++;
                    Q.add(new Node(i+1, index)); }
                apple[i+1][index] = now;
                index ++;
            }
        }
//        System.out.println(Arrays.deepToString(apple));
//        System.out.println(Arrays.deepToString(days));
        //System.exit(0);
        while(!Q.isEmpty()){
            Node tmpNode = Q.poll();
            int X = tmpNode.x;
            int Y = tmpNode.y;
            //System.out.println(X+" "+Y);
            //System.out.println(Arrays.deepToString(days));
            maxDays = Math.max(days[X][Y], maxDays);
            for(int i =0 ; i<4; i++) {
                int dx = Xcord[i];
                int dy = Ycord[i];
                if (apple[X+dx][Y+dy] ==-1) {
                    continue;
                }else if (apple[X+dx][Y+dy]==0){
                    days[X+dx][Y+dy] = days[X][Y]+1;
                    apple[X+dx][Y+dy]=1;
                    Q.add(new Node(X+dx,Y+dy));
                    filled++;
                }
            }
        }
        if(filled == totalApple){
            System.out.println(maxDays);
        }else{
            System.out.println(-1);
        }




    }
}
class Node{
    int x ,y;
    Node(int x, int y){
        this.x = x;
        this.y = y;
    }
}

