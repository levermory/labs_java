package com.mmf;
class Matrix {
    private int n;
    private int m;
    private Integer[][] data;
    public Matrix (int n, int m){
        this.n = n;
        this.m = m;
        data = new Integer[n][m];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++){
                data[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public Matrix(){
        n = 3;
        m = 3;
        data = new Integer[3][3];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++){
                data[i][j] = (int)(Math.random()*100);
            }
        }
    }
    public Matrix(Integer[][] data){
        this.n = data.length;
        this.m = data[0].length;
        this.data = data;
    }
    public int rows() {
        return n;
    }
    public Integer[] rows(int i) {
        return data[i];
    }
    public int cols() {
        return m;
    }
    public Integer[] cols(int j) {
        var cols = new Integer[n];
        for (int i = 0; i<n; i++){
            cols[i] = data[i][j];
        }
        return cols;
    }
    public String toString(){
        String result = "";
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                result += String.valueOf(data[i][j]);
                result += '\t';
            }
            result += '\n';
        }
//        StringBuilder result = new StringBuilder();
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<m; j++){
//                result.append(String.valueOf(j));
//                result.append('\t');
//            }
//            result.append('\n');
//        }
        return result;
    }
    public int index(int i, int j){
        return data[i][j];
    }
}