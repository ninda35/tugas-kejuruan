/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soall2;

/**
 *
 * @author Andriyansyah
 */
public class Bab10Soall2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         // Membuat objek Aritmatika
        Aritmatika aritmatika = new Aritmatika ();

        // Nilai untuk operasi
        int bilangan1 = 10;
        int bilangan2 = 5;

        // Mengakses dan menampilkan hasil dari metode pengurangan
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);

        // Mengakses dan menampilkan hasil dari metode perkalian
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);

        // Mengakses dan menampilkan hasil dari metode pembagian
        try {
            double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
            System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Mengakses dan menampilkan hasil dari metode pangkat
        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}

