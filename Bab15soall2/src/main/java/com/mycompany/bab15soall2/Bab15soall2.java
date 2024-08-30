/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soall2;

/**
 *
 * @author Andriyansyah
 */
public class Bab15soall2 {

    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;

        // Operasi Pengurangan
        KalkulatorKurang kurang = new KalkulatorKurang(a, b);
        System.out.println("Pengurangan: " + kurang.kurang());

        // Operasi Perkalian
        KalkulatorKali kali = new KalkulatorKali(a, b);
        System.out.println("Perkalian: " + kali.kali());

        // Operasi Pembagian
        KalkulatorBagi bagi = new KalkulatorBagi(a, b);
        System.out.println("Pembagian: " + bagi.bagi());
        System.out.println("Hello World!");
    }
}
