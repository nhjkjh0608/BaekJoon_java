package BaekJoon.Baek3000_4000;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Baek3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000000");
        int R = sc.nextInt();
        System.out.println(df.format(R*R*Math.PI));
        System.out.println(df.format(R*R*2));
    }
}
