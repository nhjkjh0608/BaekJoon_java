package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-22.
 */
import java.util.*;

public class Baek1021 {
    static int Out = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer Tok1 = new StringTokenizer(sc.nextLine()," ");
        StringTokenizer Tok2 = new StringTokenizer(sc.nextLine(), " ");
        int N = Integer.parseInt(Tok1.nextToken());
        int N1 = Integer.parseInt(Tok1.nextToken());
        LinkedList<Integer>dq = new LinkedList<>();
        for(int i =1; i<=N;i++){
            dq.add(i);
        }

        Queue<Integer> q = new LinkedList<>();
        while(Tok2.hasMoreTokens()){
            q.add(Integer.parseInt(Tok2.nextToken()));
        }
        while(!q.isEmpty()){
            int tmp = q.poll();
            int size = dq.size()-1;
            int left = dq.indexOf(tmp);
            int right = size -left+1;
            System.out.println(Arrays.toString(dq.toArray()));
            if(left>right){
                for(int i =0; i<right;i++){
                    method2(dq);
                    System.out.println(Arrays.toString(dq.toArray()));
                }
                dq.pollFirst();
                Out+= right;
            }else{
                for(int j =0; j<left;j++){
                    method1(dq);
                    System.out.println(Arrays.toString(dq.toArray()));
                }
                dq.pollFirst();
                Out+=left;
            }


        }
        System.out.println(Out);



    }
    public static void method1(LinkedList<Integer> q) {
        int k =q.pollFirst();
        q.addLast(k);
    }
    public static void method2(LinkedList<Integer> q){
        int k = q.pollLast();
        q.addFirst(k);
    }
}
