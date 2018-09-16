package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-17.
 */

import java.io.*;
import java.util.*;
public class Baek1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Number = Integer.valueOf(br.readLine());

        HashSet<String> set = new HashSet<>();

        for(int i= 0; i<Number;i++){
            set.add(br.readLine());
        }
        String [] arr = new String[set.size()];
        int size = set.size();
        set.toArray(arr);

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });

        int i,j,tmp;

        for(i= 0;i<size;i++){

            for(j=i+1;j<size;j++){
                if(arr[i].length()!=arr[j].length()){break;}
            }
            Arrays.sort(arr,i,j);
            i =j-1;
        }
        for(String a:arr){
            System.out.println(a);
        }

    }
}
