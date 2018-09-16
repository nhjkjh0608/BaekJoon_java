package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-20.
 */
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;
public class Baek1260 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok  = new StringTokenizer(br.readLine()," ");
        int nodeNum = Integer.parseInt(Tok.nextToken());
        int caseNum = Integer.parseInt(Tok.nextToken());
        int start = Integer.parseInt(Tok.nextToken());
        boolean [][]connected = new boolean[nodeNum+1][nodeNum+1];
        for(int i =0 ; i<caseNum; i++){
            String[] tmp = br.readLine().split(" ");
            int x = Integer.parseInt(tmp[0]);
            int y = Integer.parseInt(tmp[1]);
            connected[x][y] = true;
            connected[y][x] = true;
        }
        boolean []visited = new boolean[nodeNum+1];

        Stack<Integer> stack = new Stack<>();
        stack.add(start);
        StringBuffer dfs = new StringBuffer();
        while(!stack.isEmpty()){
            int tmp = stack.pop();
            if(visited[tmp]){
                continue;
            }else{
                visited[tmp] =true;
            }
            dfs.append(tmp+" ");
            for(int i = nodeNum; i>=1; i--){
                if(connected[tmp][i]) {
                    if (!visited[i]) {
                        stack.add(i);
                    }
                }
            }
        }
        boolean []visited1 = new boolean[nodeNum+1];
        Queue<Integer> q = new LinkedList<>();
        StringBuffer bfs = new StringBuffer();
        q.add(start);
        while(!q.isEmpty()){
            int tmp = q.poll();
            if(visited1[tmp]){
                continue;
            }else{
                visited1[tmp] =true;
            }
            bfs.append(tmp+" ");
            for(int i = 1; i<=nodeNum; i++){
                if(connected[tmp][i]) {
                    if (!visited1[i]) {
                        q.add(i);
                    }
                }
            }
        }
        System.out.println(dfs.toString().trim());
        System.out.println(bfs.toString().trim());
    }
}
