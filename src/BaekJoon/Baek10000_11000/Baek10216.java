package BaekJoon.Baek10000_11000;

import java.util.ArrayList;

public class Baek10216 {
    public static void main(String[] args) {

    }
}
class Group{
    public Group(Tower t) {
        this.Towers = new ArrayList<>();
        this.Towers.add(t);
    }
    ArrayList<Tower> Towers;
    public boolean cntToGroup(Tower tower){
        for(Tower t: Towers){
            if(connected(t, tower)){
                return true;
            }
        }
        return false;
    }
    static boolean connected(Tower tower1, Tower tower2){





        return false;
    }

}
class Tower{
    public Tower(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    int x;
    int y;
    int r;
}
