//Ввести с консоли n целых чисел. На консоль вывести: Числа, которые делятся на 3 или на 9.

public class Main {
    public static void main(String[] args) {
        try {
            for(String i: args){
                if(Integer.parseInt(i)%3 == 0 || Integer.parseInt(i)%9 == 0) {
                    System.out.println(i);
                }
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}