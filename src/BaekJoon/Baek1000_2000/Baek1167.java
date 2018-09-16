package BaekJoon.Baek1000_2000;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baek1167 {
    //안쓸듯
    static tree1167 tmp;

    static int distance[];
    static tree1167[] treeArr;
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
            tree1167 qwq= treeArr[x];
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
        treeArr = new tree1167[treeNum+1];
        for(int i =1; i<= treeNum;i++){
            treeArr[i] = new tree1167();
        }

        for(int i = 1; i<=treeNum;i++){
            String line = br.readLine();
            StringTokenizer tok = new StringTokenizer(line);
            boolean first = true;
            int index = Integer.parseInt(tok.nextToken());
            while(tok.hasMoreTokens()){
                int kk = Integer.parseInt(tok.nextToken());
                if(kk==-1){break;}
                int kk2 = Integer.parseInt(tok.nextToken());
                treeArr[index].connected .add(kk);
                treeArr[index].node_weight.put(kk,kk2);
            }
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
class tree1167{
    HashMap<Integer, Integer> node_weight = new HashMap<>();
    ArrayList<Integer> connected = new ArrayList<>();
}