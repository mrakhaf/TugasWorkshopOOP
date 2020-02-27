package com.company;

public class Persegi extends BangunDatar {
    @Override
    protected double hitungLuas(double x, double y) {
        return x*x;
    }

    @Override
    protected double hitungKeliling(double x, double y) {
        return x*4;
    }
}
