package BaekJoon.Baek11000_12000;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baek11504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int i= 0 ; i<N; i++){
            int fdigit,ldight;
            int len = sc.nextInt();
            int len3 = sc.nextInt();
            StringBuffer buf = new StringBuffer();
            for(int j = 0 ; j<len3; j++){
                buf.append(sc.nextInt());
            }
            fdigit = Integer.parseInt(buf.toString());
            buf = new StringBuffer();
            for(int j =0; j<len3; j++){
                buf.append(sc.nextInt());
            }
            ldight = Integer.parseInt(buf.toString());
            CircularLinkedList L = new CircularLinkedList();
            for(int j =0 ;j<len; j++){
                L.put(new node(sc.nextInt()));
            }
            System.out.println(solve(L,fdigit,ldight,len3));
        }
    }
    public static int solve(CircularLinkedList L, int fdigit, int ldigit, int size){
        int result = 0;
        Iterator<Integer> it1, it2;
        node N = L.n;
        for(int i= 0 ; i<L.size; i++){
            node tmp = N;
            StringBuffer buf = new StringBuffer();

            for(int j =0 ; j<size; j++){
                buf.append(tmp.value);
                tmp = tmp.next;
            }
            int v = Integer.parseInt(buf.toString());
            if(fdigit<= v && v<= ldigit){
                result ++;
            }
            N = N.next;
        }
        return result;
    }

}
class CircularLinkedList{
    int size= 0;
    node n;
    node last;
    void put(node node){
        if(this.n ==null){
            this.n = node;
            this.last = node;
            this.size ++;
        }else{
            this.last.next = node;
            this.last = node;
            this.last.next = n;
            this.size ++;
        }
    }
}
class node{
    int value;
    node(int value){
        this.value = value;
    }
    node next;
}
