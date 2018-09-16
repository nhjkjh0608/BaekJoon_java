package BaekJoon.Baek1000_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Baek1991 {
    public static void main(String[] args)throws IOException {
        exTree T = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i= 0 ; i<N; i++){
            String s = br.readLine();
            char a = s.charAt(0);
            char b = s.charAt(2);
            char c =s.charAt(4);
            if(T==null){
                T= new exTree(a);
                if(b=='.'){
                    T.left  = null;
                }else {
                    T.left = new exTree(b);
                }
                if(c=='.') {
                    T.right = null;
                }else{
                    T.right = new exTree(c);
                }
            }else{
                exTree tmp = Find(T,a);
                if(b=='.'){
                    tmp.left  = null;
                }else {
                    tmp.left = new exTree(b);
                }
                if(c=='.') {
                    tmp.right = null;
                }else{
                    tmp.right = new exTree(c);
                }
            }
        }
        printPreOrder(T);
        System.out.println();
        printInOrder(T);
        System.out.println();
        printPostOrder(T);

    }


    static exTree Find(exTree T, char e){
        LinkedList<exTree> q = new LinkedList<>();
        q.add(T);
        while(!q.isEmpty()){
            exTree tmp = q.poll();
            if(tmp.element == e){
                return tmp;
            }
            if(tmp.left!= null){
                q.add(tmp.left);
            }
            if(tmp.right != null){
                q.add(tmp.right);
            }
        }
        return null;
    }
    static void printPostOrder(exTree T){
        if(T == null){return;}
        printPostOrder(T.left);
        printPostOrder(T.right);
        System.out.print(T.element);
    }
    static void printInOrder(exTree T){
        if(T==null){return;}
        printInOrder(T.left);
        System.out.print(T.element);
        printInOrder(T.right);
    }
    static void printPreOrder(exTree T){
        if(T==null){return;}
        System.out.print(T.element);
        printPreOrder(T.left);
        printPreOrder(T.right);
    }

}
class exTree{
    char element;
    exTree left;
    exTree right;
    exTree(){
        this.element = '0';
        this.left = null;
        this.right  = null;
    }
    exTree(char element){
        this.element = element;
        this.left = null;
        this.right = null;
    }

}
