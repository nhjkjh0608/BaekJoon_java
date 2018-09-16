package BaekJoon.Baek1000_2000; /**
 * Created by 김재현 on 2017-07-10.
 */
import java.util.Scanner;
import java.util.Arrays;


public class Baek1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int classNum = Integer.parseInt(sc.nextLine());
        String [] arr = sc.nextLine().split(" ");
        int [] Intarr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            Intarr[i] = Integer.parseInt(arr[i]);
        }
        int max = Arrays.stream(Intarr).max().getAsInt();
        double sum = 0;
        for(int k : Intarr){
            sum += k * 100.0 /max;
        }

        System.out.printf("%.2f", round((sum)/(classNum),2));

    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}
