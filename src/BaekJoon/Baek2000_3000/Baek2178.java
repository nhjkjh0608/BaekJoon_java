package BaekJoon.Baek2000_3000;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek2178 {
    static int ans;
    static int []X = {0,0,1,-1};
    static int []Y = {1,-1,0,0};
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer tok= new StringTokenizer(sc.nextLine());
        N = Integer.parseInt(tok.nextToken());
        M = Integer.parseInt(tok.nextToken());
        boolean[][]arr = new boolean[N+2][M+2];
        boolean[][]visited = new boolean[N+2][M+2];
        for(int i = 1 ; i<=N ;i++){
            String tmp = sc.nextLine();
            for(int j =0 ; j<M; j++){
                arr[i][j+1] =( tmp.charAt(j)=='1');
            }
        }
        Queue<Node2178> Q = new LinkedList<>();
        visited[1][1] = true;
        Q.add(new Node2178(1,1,1));

        Loop:while(!Q.isEmpty()){
            Node2178 tmp = Q.poll();
            int x=  tmp.x;
            int y = tmp.y;
            int step = tmp.step;
            if(x ==N&&y==M){
                ans = step;
                break Loop;
            }
            for(int i= 0 ;i<4; i++){
                int dx = X[i];
                int dy = Y[i];
                if(visited[x+dx][y+dy]||!arr[x+dx][y+dy]){continue;}
                Q.add(new Node2178(x+dx, y+dy, step+1));
                visited[x+dx][y+dy]= true;
            }
        }
        System.out.println(ans);

    }

}
class Node2178{
    int x, y, step;
    Node2178(int x, int y,int step){
        this.x = x;
        this.y = y;
        this.step = step;
    }
}
