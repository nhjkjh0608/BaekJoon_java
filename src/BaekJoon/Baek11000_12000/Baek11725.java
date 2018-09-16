package BaekJoon.Baek11000_12000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek11725 {
    static tree11725[] treeArr;
    static boolean visited[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        treeArr = new tree11725[N+1];
        for(int i= 1;i<=N; i++){
            treeArr[i] = new tree11725(0,i);
        }
        for(int i =0 ; i<N-1;i++){
            String t = br.readLine();
            StringTokenizer Tok = new StringTokenizer(t);
            int one = Integer.parseInt(Tok.nextToken());
            int two = Integer.parseInt(Tok.nextToken());
            treeArr[one].list.add(treeArr[two]);
            treeArr[two].list.add(treeArr[one]);

        }
        visited = new boolean[N+1];
        Arrays.fill(visited,false);
        check(1,treeArr[1]);
        for(int i= 2; i<treeArr.length;i++){
            System.out.println(treeArr[i].parent);
        }
    }
    static void check(int parent,tree11725 t){
        if(visited[t.N]){return;}

        t.parent = parent;
        visited[t.N] = true;
        for(tree11725 ttt: t.list){
            check(t.N,ttt);
        }
    }

}
class tree11725{
    int N;
    int element;
    int parent;
    ArrayList<tree11725> list = new ArrayList<>();
    tree11725(int element, int N){
        this.element = element;
        this.N = N;
    }
    boolean visited = false;
}
