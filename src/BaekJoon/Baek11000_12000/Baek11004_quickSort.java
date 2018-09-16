package BaekJoon.Baek11000_12000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11004_quickSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer Tok = new StringTokenizer(br.readLine());
        StringTokenizer Tok2 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(Tok.nextToken());
        int K = Integer.parseInt(Tok.nextToken());
        int[] arr = new int[N];
        int INdex = 0;
        while(Tok2.hasMoreTokens()){
            int tmp = Integer.parseInt(Tok2.nextToken());
            arr[INdex] = tmp;
            INdex ++;
        }
        quickSort(arr,0,N-1);
        System.out.println(arr[K-1]);

    }
    static int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
}
