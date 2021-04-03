package com.mmf;

 import java.util.Arrays;

public class BoolMatrix {
    private final int n, m;
    private Boolean[][] data;

    public BoolMatrix(){
        n = 3;
        m = 3;
        data = new Boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = false;
                if(Math.random()>=0.5){
                    data[i][j] = true;
                };
            }
        }
    }
    public BoolMatrix(int n, int m){
        this.n = n;
        this.m = m;
        data = new Boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = false;
                if(Math.random()>=0.5){
                    data[i][j] = true;
                };
            }
        }
    }
    public BoolMatrix(Integer[][] data){
        this.n = data.length;
        this.m = data[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(data[i][j]>0) {
                    this.data[i][j] = true;
                }
                else {
                    this.data[i][j] = false;
                }
            }
        }
    }
    public void add(BoolMatrix M){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.data[i][j] = (this.data[i][j] || M.data[i][j]);
            }
        }
    }
    public void mult(BoolMatrix M){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.data[i][j] = (this.data[i][j] && M.data[i][j]);
            }
        }
    }
    public int count(){
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(this.data[i][j]) res++;
            }
        }
        return res;
    }
    public void inverse(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                this.data[i][j] = !(this.data[i][j]);
            }
        }
    }
     public void sort(){
         Arrays.sort(data, new cmp());
     }
    public String toString(){
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(data[i][j]){
                    ans += "1 ";
                }
                else {
                    ans += "0 ";
                }
            }
            ans += "\n";
        }
        return ans;
    }
}