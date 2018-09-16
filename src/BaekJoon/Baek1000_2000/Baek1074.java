package BaekJoon.Baek1000_2000;

import java.util.Scanner;

public class Baek1074 {
    static int order =0;
    static int r, c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();
        int length = (int)Math.pow(2,N);

        solve(0,0,length);
        System.out.println(order);
    }
    static void solve(int x, int y, int size ){
        if(x ==r &&y == c ){return;}
        size/= 2;
        //System.out.println(x+" "+y+" "+ size);
        boolean X = (x+size)<=r;
        boolean Y = (y+size)<= c;

        if(X==true && Y== true){
            order += size*size*3;
            solve(x+size, y+size, size);
        }else if(X==false && Y ==false){
            solve(x,y,size);

        }else if (X == true && Y == false){
            order += size*size*2;
            solve(x+size, y, size);

        }else if(X ==false && Y == true){
            order += size*size;
            solve(x,y+size, size);
        }
    }
}
