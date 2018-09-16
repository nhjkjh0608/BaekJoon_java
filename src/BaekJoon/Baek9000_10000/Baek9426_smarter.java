package BaekJoon.Baek9000_10000;

/**
 * Created by 김재현 on 2017-07-16.
 */

import java.util.*;
public class Baek9426_smarter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for( int i =0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<k; i++) list.add(arr[i]);
        Collections.sort(list);
        long sum =list.get(((k+1)/2)-1);
        for(int i = k; i<n;i++){
            list.remove(Collections.binarySearch(list,arr[i-k]));
            int index = Collections.binarySearch(list, arr[i]);
            if(index<0){
                index = -index -1;
            }
            list.add(index, arr[i]);
            sum += list.get(((k+1)/2)-1);
        }
        System.out.println(sum);
    }
}
