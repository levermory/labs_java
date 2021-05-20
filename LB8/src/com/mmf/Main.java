// Преобразование Барроуза-Уиллера
// Восстановить слово по его преобразованию Барроуза-Уиллера

package com.mmf;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter text line:");

        String line = sc.nextLine();

//        var str = new MyString("JAVA");
        var str = new MyString(line);

        String[] a = new String[str.length()];

        for (int i=0; i<str.length(); i++){
            a[i] = str.getString();
            str.rotate(1);
        }
        Arrays.sort(a);

        StringBuilder res = new StringBuilder(str.length());
        for(var i: a){
            res.append(i.charAt(str.length() - 1));
        }
        System.out.print(res);
    }
}
