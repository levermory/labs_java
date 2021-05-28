package com.mmf;

class SquareMatrix {
    private int n;

    private Integer[][] data;

    public SquareMatrix(Integer[][] data){
        this.n = data.length;
        this.data = data;
    }

    public int rows() {
        return n;
    }
    public Integer[] rows(int i) {
        return data[i];
    }
    public int cols() {
        return n;
    }
    public Integer[] cols(int j) {
        var cols = new Integer[n];
        for (int i = 0; i<n; i++){
            cols[i] = data[i][j];
        }
        return cols;
    }
    public void transpose(){
        var temp = data;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = temp[j][i];
            }
        }

    }
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                result.append(String.valueOf(data[i][j]));
                result.append('\t');
            }
            result.append('\n');
        }
        return result.toString();
    }
    public int index(int i, int j){
        return data[i][j];
    }
}