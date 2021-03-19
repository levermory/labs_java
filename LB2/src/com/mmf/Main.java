// Найти количество всех седловых точек матрицы (матрица А имеет седло-
// вую точку А(i,j), если А(i,j) является минимальным элементом в i-й строке
// и максимальным в j-м столбце).
package com.mmf;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        try {
            Integer[][] test = {{-6,1,-2},{7,9,1},{5,2}};
            var matrix = new Matrix(test);
//            var matrix = new Matrix(4,7);
            System.out.print(matrix);
            System.out.print('\n');
            int count = 0;
            for (int i = 0; i<matrix.rows(); i++){
                for (int j = 0; j<matrix.cols(); j++){
                    if(
//                            Collections.max(Arrays.asList(matrix.cols(j))) == Collections.min(Arrays.asList(matrix.rows(i)))
                            Collections.max(Arrays.asList(matrix.cols(j))).equals(Collections.min(Arrays.asList(matrix.rows(i))))
                    ){
                        System.out.print(matrix.index(i,j));
                        System.out.print('\n');
                        count++;
                    }
                }
            }
            System.out.print(count);
        }
        catch (Exception ex) {
            System.err.print(ex);
        }
    }
}