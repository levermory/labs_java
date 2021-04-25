package com.mmf;

public class Fraction {
    private Number nominator, denominator;
    public Fraction(int n, int m)
    {
        nominator = new Number(n);
        denominator = new Number(m);
    }
    public Fraction(Number n, Number m)
    {
        nominator = n;
        denominator = m;
    }
    public Fraction add(Fraction b)
    {
        var n = this.nominator.mult(b.denominator).add(b.nominator.mult(this.denominator));
        var m = this.denominator.mult(b.denominator);
        return new Fraction(n,m);
    }
    public Fraction sub(Fraction b)
    {
        var n = this.nominator.mult(b.denominator).sub(b.nominator.mult(this.denominator));
        var m = this.denominator.mult(b.denominator);
        return new Fraction(n,m);
    }
    public Fraction mult(Fraction b)
    {
        var n = this.nominator.mult(b.nominator);
        var m = this.denominator.mult(b.denominator);
        return new Fraction(n,m);
    }
    public Fraction div(Fraction b)
    {
        var n = this.nominator.mult(b.denominator);
        var m = this.denominator.mult(b.nominator);
        return new Fraction(n,m);
    }
    public boolean equals(Fraction b)
    {
        return (this.nominator.equals(b.nominator) && this.denominator.equals(b.denominator));
    }
    public int hashCode()
    {
        return 1;
    }

    public String toString()
    {
        return nominator.toString() + "/" + denominator.toString();
    }
    
}
