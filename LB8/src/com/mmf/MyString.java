package com.mmf;

public class MyString{
    private String string;

    public String getString(){
        return string;
    }

    public MyString(String a){
        string = a;
    }

    public void rotate(int i)
    {
        if(i>=0){
            var temp1 = string.substring(0, string.length() - i);
            var temp2 = string.substring(string.length() - i);
            this.string = temp2+temp1;
        }
        else {
            var temp1 = string.substring(0, -i);
            var temp2 = string.substring(-i);
            this.string = temp2+temp1;
        }

    }

    public String toString(){
        return string;
    }
    public char[] toCharArray(){
        return string.toCharArray();
    }
    public int length(){
        return string.length();
    }
}
