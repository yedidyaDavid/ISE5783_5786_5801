package primitives;

import java.awt.* ;

public class Vector extends Point {

    Vector(Double3 p) {
        super(p);
        if (zero.equals(p)){
            throw new IllegalArgumentException("The vector is the zero vector");
        }
    }

    public Vector(double a, double b, double c) {
        super(a,b,c);
        if (zero.equals(p)){
            throw new IllegalArgumentException("The vector is the zero vector");
        }
    }



}
