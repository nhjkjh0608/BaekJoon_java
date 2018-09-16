package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-16.
 */
import java.util.*;
public class Baek2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i= 0; i<Case;i++){
            list.add(sc.nextInt());
        }


        Collections.sort(list);
        for(int i:list){
            System.out.println(i);
        }
    }
}
