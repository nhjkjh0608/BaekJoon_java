package BaekJoon.Baek1000_2000;

import java.util.Arrays;
import java.util.Scanner;

public class Baek1325_time_out {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ComNum = sc.nextInt();
        int caseNum = sc.nextInt();
        boolean connected[][] = new boolean[ComNum][ComNum];

        int Computer[] = new int[ComNum];
        Arrays.fill(Computer,-1);
        for(int i=  0; i<caseNum; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            connected[y - 1][x-1] = true;

        }
        for(int i = 0; i<ComNum; i++){
            search(Computer,i,connected,ComNum);
        }



        for(int i= 0; i<ComNum; i++){
            if(Computer[i]==max){
                System.out.println(i+1);
            }
        }
    }
    static void search(int Computer[], int value, boolean connected[][],int ComNum){
        boolean visited[] = new boolean[ComNum];
        dfs(connected,visited,ComNum,value);
        int Num = 0;
        for(boolean b: visited){
            if(b) Num++;
        }
        Computer[value]= Num;
        max = Math.max(Num, max);
    }
    static void dfs(boolean[][] connected, boolean[]visited,int ComNum,int value){
        if(visited[value]){return;}

        visited[value] = true;
        for(int i =0; i<ComNum; i++){

            if(connected[value][i]&&!visited[i]){
                dfs(connected,visited,ComNum,i);
            }
        }
    }
}
