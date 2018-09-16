package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-17.
 */

import java.util.*;

public class Baek1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] Arr = sc.nextLine().toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0; i<Arr.length;i++){
            arr.add(Arr[i]-48);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        for(int i:arr){
            System.out.print(i);
        }

    }
}
