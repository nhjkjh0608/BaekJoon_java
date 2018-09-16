package BaekJoon.Baek1000_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek1967 {
    //안쓸듯
    static tree1967 tmp;

    static int distance[];
    static tree1967[] treeArr;
    static boolean visited[];
    static int treeNum;
    static void bfs(int start){
        distance = new int[treeNum+1];
        visited = new boolean[treeNum+1];
        LinkedList<Integer> tmp = new LinkedList<>();
        tmp.add(start);
        visited[start] = true;
        while(!tmp.isEmpty()){
            int x = tmp.poll();
            //System.out.println(x);
            tree1967 qwq= treeArr[x];
            for(int k: qwq.connected){
                if(!visited[k]) {
                    visited[k] = true;
                    distance[k] = distance[x] + qwq.node_weight.get(k);
                    tmp.add(k);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        treeNum = Integer.parseInt(br.readLine());
        treeArr = new tree1967[treeNum+1];
        for(int i =1; i<= treeNum;i++){
            treeArr[i] = new tree1967();
        }

        for(int i = 1; i<treeNum;i++){
            String line = br.readLine();
            StringTokenizer tok = new StringTokenizer(line);
            int A = Integer.parseInt(tok.nextToken());
            int B = Integer.parseInt(tok.nextToken());
            int C = Integer.parseInt(tok.nextToken());
            treeArr[A].connected.add(B);
            treeArr[A].node_weight.put(B,C);
            treeArr[B].connected.add(A);
            treeArr[B].node_weight.put(A,C);
        }
        bfs(1);
        int tmp = 0;
        for(int i = 1; i<distance.length;i++){
            if(distance[tmp]<distance[i]){
                tmp = i;
            }
        }
        bfs(tmp);
        int ans = distance[0];
        for(int i =1; i<distance.length;i++){
            ans = Math.max(ans, distance[i]);
        }
        System.out.println(ans);
    }
}
class tree1967{
    HashMap<Integer, Integer> node_weight = new HashMap<>();
    ArrayList<Integer> connected = new ArrayList<>();
}