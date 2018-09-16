package BaekJoon.Baek1000_2000;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek1780 {
    static int minus = 0, zero = 0, one = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int[][] arr= new int [size][size];
        for(int i =0; i<size; i++){
            StringTokenizer Tok = new StringTokenizer(sc.nextLine());
            int index =0;
            while(Tok.hasMoreTokens()){
                arr[i][index] = Integer.parseInt(Tok.nextToken());
                index ++;
            }
        }
        check(arr, size, 0, 0);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);

    }
    static void check(int[][]arr,int size,int x, int y){
        if(size == 1){
            plus(arr[x][y]);
            return;
        }
        int check = arr[x][y];
        boolean slice  = false;
        Loop1: for(int i =0; i<size ; i++){
            for(int j =0 ; j<size; j++){
                if(arr[x+i][y+j]!= check) {
                    slice = true;
                    break Loop1;
                }
            }
        }
        if(slice){
            size /= 3;
            check(arr, size, x,y);
            check(arr,size,x+size,y);
            check(arr, size, x+size*2,y);
            check(arr, size, x, y+size);
            check(arr, size, x, y+size*2);
            check(arr, size, x+size, y+size);
            check(arr, size, x+ 2*size, y+size);
            check(arr, size, x+size, y+2*size);
            check(arr,size, x+2*size, y+2*size);
        }else{
            plus(arr[x][y]);
        }
    }
    static void plus(int a){
        switch(a){
            case 1:
                one++;
                break;
            case -1:
                minus++;
                break;
            default:
                zero++;
                break;
        }
        return;
    }
}
