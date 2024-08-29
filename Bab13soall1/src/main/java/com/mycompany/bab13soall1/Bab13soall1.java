/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soall1;

/**
 *
 * @author Andriyansyah
 */
public class Bab13soall1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Kalkulator kalkulator = new Kalkulator();
        
        // Nilai yang akan digunakan dalam operasi
        int a = 20;
        int b = 10;

        // Menghitung dan menampilkan hasil operasi
        System.out.println("Hasil Pertambahan : " + kalkulator.tambah(a, b));
        System.out.println("Hasil Pengurangan : " + kalkulator.kurang(a, b));
        System.out.println("Hasil Perkalian   : " + kalkulator.kali(a, b));
        System.out.println("Hasil Pembagian   : " + kalkulator.bagi(a, b));
    }
}
