package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baek7569 {
    public static void main(String[] args)throws IOException {
        int[] xCord = {0,0,0,0,1,-1};
        int[] yCord = {1,-1,0,0,0,0};
        int[] zCord = {0,0,1,-1,0,0};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(Tok.nextToken());
        int y = Integer.parseInt(Tok.nextToken());
        int z = Integer.parseInt(Tok.nextToken());
        int [][][] apple = new int[z+2][y+2][x+2];
        int [][][] days = new int[z+2][y+2][x+2];
        int totalApple = x*y*z;
        int maxDays =0;
        int filled = 0;
        Queue<cord> q = new LinkedList<>();

        for(int i = 0; i<apple.length;i++){
            for(int j =0; j<apple[0].length; j++){
                Arrays.fill(apple[i][j],-1);
            }
        }
        for(int i = 1; i<=z; i++){
            for(int j = 1; j<=y; j++){
                int index = 1;
                Tok = new StringTokenizer(br.readLine());
                while(Tok.hasMoreTokens()){
                    int now = Integer.parseInt(Tok.nextToken());
                    if(now ==-1){totalApple--;}
                    else if(now ==1){
                        filled++;
                        q.add(new cord(i, j,index)); }
                    apple[i][j][index] = now;
                    index ++;
                }
            }
        }
        cord tmpCord = new cord(1,2,3);
//        System.out.println(q.size());
        while(!q.isEmpty()){
            tmpCord = q.poll();
            int X = tmpCord.x;
            int Y = tmpCord.y;
            int Z = tmpCord.z;
//            System.out.println("asdsa"+ Z+" "+Y+" "+X);
//            System.out.println((X)+" "+(Y)+" "+ (Z)+" "+ days[X][Y][Z]);

            //System.out.println(X+" "+Y);
            //System.out.println(Arrays.deepToString(days));
            for(int i =0 ; i<6; i++) {
                int dx = xCord[i];
                int dy = yCord[i];
                int dz = zCord[i];
//                System.out.println(Arrays.deepToString(days[0]));
//                System.out.println(Arrays.deepToString(days[1]));
//                System.out.println(Arrays.deepToString(days[2]));
//                System.out.println(Arrays.deepToString(apple[1]));

                if (apple[Z+dz][Y+dy][X+dx] ==-1) {
                    continue;
                }else if (apple[Z+dz][Y+dy][X+dx]==0){
//                    System.out.println(Z+" "+Y+" "+X );
//                    System.out.println((Z+dz)+" "+(Y+dy)+" "+(X+dx));
//                    System.out.println(Arrays.deepToString(days[1]));
//                    System.out.println(Arrays.deepToString(apple[1]));
//                    System.out.println();
                    days[Z+dz][Y+dy][X+dx] = days[Z][Y][X]+1;
                    apple[Z+dz][Y+dy][X+dx]=1;
                    q.add(new cord(Z+dz,Y+dy,X+dx));
                    filled++;
//                    System.out.println((Z+dz)+" "+(Y+dy)+" "+(X+dx));
//                    System.out.println(Arrays.deepToString(days[1]));
//                    System.out.println();
                }

            }
        }
        maxDays = days[tmpCord.z][tmpCord.y][tmpCord.x];


        if(filled == totalApple){
            System.out.println(maxDays);
        }else{
            System.out.println(-1);
        }
    }
}
class cord{
    int x, y, z;
    cord(int z, int y, int x){
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
