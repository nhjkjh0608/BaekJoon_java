package BaekJoon.Baek6000_7000;


import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek6549 {
    static long area = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            area = 0;
            int check = sc.nextInt();
            if(check == 0){
                break;
            }
            int []arr = new int[check];
            for(int i =0; i<check; i++){
                arr[i] = sc.nextInt();
            }

            for(int i= 0; i<check; i++){
                getMax(arr,i);
            }
            System.out.println(area);

        }
        int System =3;


    }
    static void getMax(int[]arr, int index){
        int length = arr.length;
        long w = 1;
        for(int i = index-1; i>=0; i--){
            if(arr[index]>arr[i]){
                break;
            }
            w++;
        }
        for(int i =index+1; i<length; i++){
            if(arr[index]>arr[i]){
                break;
            }
            w++;
        }
        long k = w*arr[index];
        if(k>area){
            area =  k;
        }
    }
}
