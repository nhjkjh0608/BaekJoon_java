package BaekJoon.Baek10000_11000;

/**
 * Created by 김재현 on 2017-07-16.
 */
import java.io.*;
public class Baek10989 {
    public static void main(String[] args) throws IOException {
        new Baek10989().sort();
    }
    public void sort() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10001];
        int caseNum = Integer.parseInt(br.readLine().trim());
        for(int i =0; i<caseNum;i++){
            arr[Integer.parseInt(br.readLine().trim())]++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i= 1;i<10001;i++){
            int k = arr[i];
            for(int j = 0; j<k;j++){
                bw.write(i+"\n");
            }
        }
        br.close();
        bw.close();
    }
}
