package com.company;

public class JajarGenjang extends BangunDatar {
    @Override
    protected double hitungLuas(double x, double y) {
        double t = ((2*(x+y))/2)-x;
        return x*t;
    }
}
