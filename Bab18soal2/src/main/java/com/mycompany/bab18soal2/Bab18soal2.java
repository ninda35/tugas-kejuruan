/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab18soal2;

/**
 *
 * @author Andriyansyah
 */
public class Bab18soal2 {

    public static void main(String[] args) {
        try {
            // Kode yang tidak menyebabkan eksepsi
            Float data = 500 / 15f; // Perbaiki pembagian menjadi float dengan '15f'
            System.out.println(data);
        } catch (NullPointerException e) {
            // Ini tidak akan dijalankan karena tidak ada NullPointerException
            System.out.println(e);
        } finally {
            // Ini akan selalu dijalankan
            System.out.println("Blok finally akan selalu di eksekusi");
        }
    }
}
