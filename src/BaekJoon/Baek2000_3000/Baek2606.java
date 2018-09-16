package BaekJoon.Baek2000_3000;

import java.util.*;

public class Baek2606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        boolean [] computer = new boolean[com+1];
        boolean [][] connected = new boolean[com+1][com+1];

        for(int i= 0 ;i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            connected[a][b] = true;
            connected[b][a] = true;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()){
            int check = q.poll();
            computer[check] = true;
            for(int i= 1; i<=com;i++){
                if(connected[check][i]){
                    if(!computer[i]){
                        q.add(i);
                        computer[i] = true;
                    }
                }
            }
        }
        int solve = 0;
        for(boolean a: computer){
            if(a){solve++;}
        }
        System.out.println(solve-1);
    }
}
