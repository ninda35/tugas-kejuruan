/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal1a;

/**
 *
 * @author Andriyansyah
 */
public class Bab18soal1A {

    public static void main(String[] args) {
        try {
            // Kode yang mungkin menyebabkan eksepsi
            int result = 10 / 0;  // Ini akan menyebabkan ArithmeticException
            System.out.println("Hasil: " + result);
        } catch (ArithmeticException e) {
            // Menangkap dan menangani eksepsi
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        
        System.out.println("Program tetap berjalan...");
        System.out.println("Hello World!");
    }
}
