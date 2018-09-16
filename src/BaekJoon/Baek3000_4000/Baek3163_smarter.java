package BaekJoon.Baek3000_4000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Baek3163_smarter {

    private BufferedReader br;
    private BufferedWriter bw;
    private StringTokenizer st;
    private Ant[] ants;
    private int[] ids;
    private int t;
    private int n;
    private int l;
    private int k;

    public static void main(String[] args) throws IOException {
        Baek3163_smarter main = new Baek3163_smarter();
        main.start();
    }

    private void start() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            ants = new Ant[n];
            ids = new int[n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int len = Integer.parseInt(st.nextToken());
                int id = Integer.parseInt(st.nextToken());
                ids[i] = id;
                if (id < 0) {
                    ants[i] = new Ant(len, true);
                } else {
                    ants[i] = new Ant(l - len, false);
                }
            }

            int idx = 0;
            for (Ant ant : ants) {
                if (ant.isLeft()) {
                    ant.setId(ids[idx++]);
                }
            }
            for (Ant ant : ants) {
                if (!ant.isLeft()) {
                    ant.setId(ids[idx++]);
                }
            }
            Arrays.sort(ants);

            bw.write(String.valueOf(ants[k - 1].getId()));
            if (t > 0) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

class Ant implements Comparable<Ant> {
    private int id;
    private int len;
    private boolean isLeft;

    public Ant(int len, boolean isLeft) {
        this.len = len;
        this.isLeft = isLeft;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public boolean isLeft() {
        return isLeft;
    }

    public void setLeft(boolean isLeft) {
        this.isLeft = isLeft;
    }

    @Override
    public int compareTo(Ant a) {
        if (this.len < a.len) {
            return -1;
        } else if (this.len > a.len) {
            return 1;
        }
        if (this.id < a.id) {
            return -1;
        } else if (this.id > a.id) {
            return 1;
        }
        return 0;
    }
}