package com.company;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {
	    Persegi P = new Persegi();
	    PersegiPanjang PP = new PersegiPanjang();
	    Lingkaran L = new Lingkaran();
	    Segitiga S = new Segitiga();
	    JajarGenjang JG = new JajarGenjang();

	    Scanner input = new Scanner(System.in);
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
	    String ulangi;

	    do {
	        double x, y;
	        int menu;

            System.out.println("Kalkulator Bangun Datar");
            System.out.println("=======================");
            System.out.println();
            System.out.println("Menu Pilihan");
            System.out.println("============");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Jajar Genjang");
            System.out.print("Masukkan menu pilihan : ");
            menu = input.nextInt();

            switch (menu){
                case 1 : {//Persegi
                    System.out.println("Persegi");
                    System.out.println("=======");
                    System.out.print("Masukkan sisi : ");
                    x = input.nextDouble();
                    y = 0;
                    System.out.println("Luas = " + df.format(P.hitungLuas(x, y)));
                    System.out.println("Keliling = " + df.format(P.hitungKeliling(x, y)));
                    break;
                }
                case 2 : {
                    //Persegi Panjang
                    System.out.println("Persegi Panjang");
                    System.out.println("===============");
                    System.out.print("Masukkan panjang : ");
                    x = input.nextDouble();
                    System.out.print("Masukkan lebar :");
                    y = input.nextDouble();
                    System.out.println("Luas = " + df.format(PP.hitungLuas(x, y)));
                    System.out.println("Keliling = " + df.format( PP.hitungKeliling(x, y)));
                    break;
                }
                case 3 : {//Lingkaran
                    System.out.println("Lingkaran");
                    System.out.println("=========");
                    System.out.print("Masukkan jari-jari : ");
                    x = input.nextDouble();
                    y = 0;
                    System.out.println("Luas = " + df.format(L.hitungLuas(x, y)));
                    System.out.println("Keliling = " + df.format(L.hitungKeliling(x, y)));
                    break;
                }
                case 4 : {
                    //Segitiga
                    System.out.println("Segitiga");
                    System.out.println("========");
                    System.out.print("Masukkan sisi alas : ");
                    x = input.nextDouble();
                    System.out.print("Masukkan sisi miring :");
                    y = input.nextDouble();
                    System.out.println("Luas = " + df.format(S.hitungLuas(x, y)));
                    System.out.println("Keliling = " + df.format(S.hitungKeliling(x, y)));
                    break;
                }
                case 5 : {
                    //Jajar Genjang
                    System.out.println("Jajar Genjang");
                    System.out.println("=============");
                    System.out.print("Masukkan panjang : ");
                    x = input.nextDouble();
                    System.out.print("Masukkan lebar :");
                    y = input.nextDouble();
                    System.out.println("Luas = " + df.format(JG.hitungLuas(x, y)));
                    System.out.println("Keliling = " + df.format(JG.hitungKeliling(x, y)));
                    break;
                }
        }
        System.out.print("Ulangi(y/n) = ");
        ulangi = bf.readLine();
    } while(ulangi.toUpperCase().equals("Y"));
    }
}
