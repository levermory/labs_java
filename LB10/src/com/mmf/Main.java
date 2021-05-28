// Входной файл содержит совокупность строк. 
// Строка файла содержит строку квадратной матрицы. 
// Ввести матрицу в двумерный массив (размер матрицы
// найти). Вывести исходную матрицу и результат ее транспонирования.

package com.mmf;


import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            int lines = 0;
            FileReader file = new FileReader("input.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                lines++;
                sc.nextLine();
            }
            file.close();
            sc.close();
            file = new FileReader("input.txt");
            sc = new Scanner(file);
            System.out.println(lines);
            Integer data[][] = new Integer[lines][lines];
            for (int i = 0; i < lines; i++) {
                for (int j = 0; j < lines; j++) {
                    data[i][j] = sc.nextInt();
                }
            }
            SquareMatrix matrix = new SquareMatrix(data);
            System.out.println(matrix);
            matrix.transpose();
            System.out.println(matrix);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
