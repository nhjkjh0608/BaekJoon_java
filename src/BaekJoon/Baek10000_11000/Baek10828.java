package BaekJoon.Baek10000_11000;

/**
 * Created by 김재현 on 2017-07-19.
 */
import java.io.*;
import java.util.Stack;
public class Baek10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum  = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<caseNum;i++){
            String [] commandArr = br.readLine().split(" ");
            if(commandArr.length==2){
                stack.push(Integer.parseInt(commandArr[1]));
                continue;
            }
            switch (commandArr[0]){
                case "pop":
                    if(stack.empty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.pop());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if (stack.empty()){
                        System.out.println(1);
                    }else{
                        System.out.println(0);
                    }
                    break;
                case "top":
                    if(stack.empty()){
                        System.out.println(-1);
                    }else{
                        System.out.println(stack.peek());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
