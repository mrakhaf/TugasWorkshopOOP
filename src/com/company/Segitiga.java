package com.company;

public class Segitiga extends BangunDatar{
    @Override
    protected double hitungLuas(double x, double y) {
        double t = Math.pow(((0.5*x)*(0.5*x))+(y*y),0.5);
        return (0.5)*x*t;
    }

    @Override
    protected double hitungKeliling(double x, double y) {
        return (y*2)+x;
    }
}
