//A 14. Создать объект класса Простая дробь, используя класс Число. Методы:
//вывод на экран, сложение, вычитание, умножение, деление.
//Аргументировать принадлежность классу каждого создаваемого метода
// и корректно переопределить для каждого класса методы equals(), hashCode(), toString()

package com.mmf;

public class Main {

    public static void main(String[] args) {
        var a = new Fraction(3,4);
        var b = new Fraction(3,4);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a.add(b));
        System.out.println(a.sub(b));
        System.out.println(a.mult(b));
        System.out.println(a.div(b));
        System.out.println(a.equals(b));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}