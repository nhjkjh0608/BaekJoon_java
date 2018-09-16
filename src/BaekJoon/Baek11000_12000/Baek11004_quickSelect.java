package BaekJoon.Baek11000_12000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek11004_quickSelect{
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        int i, n, k, arr[];
        String line[] = in.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        k = Integer.parseInt(line[1]);
        arr = new int[n];

        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        for(i=0;i<n;i++) arr[i] = Integer.parseInt(st.nextToken());

        out.write(quickSelect(arr, 0, n-1, k-1)+"");
        out.close();
        in.close();
    }

    private static int quickSelect(int arr[], int front, int rear, int k) {
        int i, j, pivot, tmp;

        while(front<rear) {
            i = front;
            j = rear;
            pivot = arr[(front+rear)>>>1];

            while(i<j) {
                if(pivot<=arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    j--;
                }
                else i++;
            }

            if(pivot<arr[i]) i--;

            if(k<=i) rear = i;
            else front = i+1;
        }
        return arr[k];
    }
}