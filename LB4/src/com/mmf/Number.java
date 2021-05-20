package com.mmf;

public class Number
{
    private Integer value;
    public Number()
    {
        value = 0;
    }
    public Integer getvalue()
    {
        return value;
    }
    public Number(int a)
    {
        this.value = a;
    }
    public Number add(Number b)
    {
        return new Number(this.value + b.value);
    }
    public Number sub(Number b)
    {
        return new Number(this.value - b.value);
    }
    public Number mult(Number b)
    {
        return new Number(this.value * b.value);
    }
    public String toString()
    {
        return value.toString();
    }
    public boolean equals(Number b)
    {
        return this.value.equals(b.value);
    }
    public int hashCode()
    {
        return value;
    }
}
