package BaekJoon.Baek2000_3000;

/**
 * Created by 김재현 on 2017-07-12.
 */


import java.util.Scanner;
public class Baek2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int Return = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] == '='){
                if(arr[i-1]=='c'||arr[i-1]=='s'){
                    continue;
                }else{
                    if(i-2<0){
                        continue;
                    }else{
                        if(arr[i-2]=='d'){
                            Return -=1;
                            continue;
                        }else{
                            continue;
                        }
                    }
                }
            }else if(arr[i]=='-'){
                continue;
            }else if(arr[i]=='j'){
                if(arr[i-1]=='l'||arr[i-1]=='n'){
                    continue;
                }
            }
            Return +=1;
        }
        System.out.println(Return);
    }
}
