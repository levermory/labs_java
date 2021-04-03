//14. Определить класс Булева матрица (BoolMatrix).
// Реализовать методы для логического сложения (дизъюнкции),
// умножения и инверсии матриц. Реализовать методы для
// подсчета числа единиц в матрице и упорядочения строк
// в лексикографическом порядке.

package com.mmf;

 import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
       
        BoolMatrix M1 = new BoolMatrix(5,6);
        BoolMatrix M2 = new BoolMatrix(5,6);
        System.out.println(M1);
        System.out.println(M2);
        M1.add(M2);
        System.out.println(M1);
        M1.mult(M2);
        System.out.println(M1);
        System.out.println(M1.count());
        M1.inverse();
        System.out.println(M1);
        M1.sort();
        System.out.println(M1);
    }
}

 class cmp implements Comparator<Boolean[]> {
     public int compare(Boolean[] a, Boolean[] b) {
         int res=0;
         for (int i = 0; i < a.length; i++) {
             if(a[i] && !b[i]){
                 res= -1; break;
             }
             else if(!a[i] && b[i]){
                 res= 1; break;
             }
             else res = 0;
         }
         return res;
        
     }
 }
