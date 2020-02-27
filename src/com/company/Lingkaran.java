package com.company;

public class Lingkaran extends BangunDatar{
    @Override
    protected double hitungLuas(double x, double y) {
        return (Math.PI)*x*x;
    }

    @Override
    protected double hitungKeliling(double x, double y) {
        return (Math.PI)*x*2;
    }
}
