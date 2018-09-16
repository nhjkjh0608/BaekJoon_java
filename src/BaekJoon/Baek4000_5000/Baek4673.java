package BaekJoon.Baek4000_5000;

/**
 * Created by 김재현 on 2017-07-10.
 */

public class Baek4673 {
    public static void main(String[] args) {
        boolean[] List = new boolean[10001];
        for(int i = 1; i<List.length ; i++){
            List[i] = false;
        }

        for(int i = 1; i<List.length ; i++) {
            if (List[i] == true) {
                continue;
            } else {
                int tmp = i;
                while(true){
                    tmp = get(tmp);
                    if(tmp >10000){
                        break;
                    }else{
                        List[tmp] = true;
                    }
                }
            }
        }

        for(int i = 1; i<List.length; i++){
            if(List[i]==false){
                System.out.println(i);
            }
        }
    }
    public static int get(int x){
        String tmp = String.valueOf(x);
        int Tmp = x;
        char [] Char = tmp.toCharArray();
        for(int i = 0; i<Char.length;i++){
            Tmp += Char[i]- 48;
        }
        return Tmp;
    }
}
