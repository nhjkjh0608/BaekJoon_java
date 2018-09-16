package BaekJoon.Baek3000_4000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Baek3163 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            ArrayList<ant> list = new ArrayList<>();
            LinkedList<Integer> Linked = new LinkedList<>();
            ArrayList<tmp> ants = new ArrayList<>();
            int A =0;
            StringTokenizer tt = new StringTokenizer(br.readLine()," ");
            int Case = Integer.parseInt(tt.nextToken());
            int length = Integer.parseInt(tt.nextToken());
            ant.length = length;
            int NN = Integer.parseInt(tt.nextToken());
            while(Case-->0){
                StringTokenizer Tok = new StringTokenizer(br.readLine()," ");
                int cord = Integer.parseInt(Tok.nextToken());
                int id = Integer.parseInt(Tok.nextToken());
                Linked.add(id);
                list.add(new ant(cord,id));
            }
            Collections.sort(list);
            for(int i =0; i<=NN; i++){
                int checkInt = list.get(0).id;
                int distance = list.get(0).distance;
                list.remove(0);
                if(checkInt>0){
                    A = Linked.pollLast();
                    ants.add(new tmp(distance,A));
                }else{
                    A = Linked.pollFirst();
                    ants.add(new tmp(distance,A));
                }

            }
            Collections.sort(ants);
            System.out.println(ants.get(NN-1).id);


        }

    }
}
class ant implements Comparable<ant>{
    static int length = 0;
    int distance;
    int id;
    ant(){}
    ant(int cord, int id){
        if(id>0){
            distance = length- cord;
        }else{
            distance = cord;
        }

        this.id  =id;
    }
    @Override
    public int compareTo(ant o) {
        if(distance==o.distance){
            return Math.abs(id)-Math.abs(o.id);
        }else{
            return distance- o.distance;
        }
    }
}
class tmp extends ant{

    tmp(int distance, int id){
        super.distance = distance;
        super.id =id;
    }

}
