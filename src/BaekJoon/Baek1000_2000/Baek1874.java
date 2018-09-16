package BaekJoon.Baek1000_2000;

/**
 * Created by 김재현 on 2017-07-19.
 */
import java.io.*;
import java.util.*;
public class Baek1874 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> answer = new ArrayList<>();
        Stack <Integer> stack = new Stack<>();
        int intStack = 1;
        ArrayList<Integer> input = new ArrayList<>();

        for(int i= 0 ;i<N;i++){
            input.add(Integer.parseInt(br.readLine()));
        }
        boolean checkTrue = true;
        for(int ikk: input){
            while(intStack<= ikk){
                stack.push(intStack);
                intStack++;
                answer.add("+");
            }
            if(stack.peek()==ikk){
                stack.pop();
                answer.add("-");
            }else{
                checkTrue = false;
                break;
            }
        }
        if(checkTrue) {
            for (String st : answer) {
                System.out.println(st);
            }
        }else{
            System.out.println("NO");
        }
    }
}
