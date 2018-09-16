package BaekJoon.Baek9000_10000;
import java.util.*;
public class Baek9251 {
    static int[][] lcs;
    static char[] Arr;
    static  char[] Arr2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arr = sc.nextLine().toCharArray();
        Arr2 = sc.nextLine().toCharArray();
        lcs = new int[Arr.length+1][Arr2.length+1];
        for(int i =0; i<Arr.length+1;i++){
            Arrays.fill(lcs[i],-1);
        }
        System.out.println(LCS(Arr.length,Arr2.length));
    }
    static int LCS(int i, int j){
        if(lcs[i][j]!=-1){
            return lcs[i][j];
        }
        if(i==0||j==0){
            lcs[i][j] = 0;
            return 0;
        }
        if(Arr[i-1]==Arr2[j-1]){
            lcs[i][j] = LCS(i-1,j-1)+1;
            return lcs[i][j];
        }else{
            lcs[i][j] = Math.max(LCS(i,j-1),LCS(i-1,j));
            return lcs[i][j];
        }
    }
}
