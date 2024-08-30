/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16soal2;

/**
 *
 * @author Andriyansyah
 */
public class Bab16soal2 {

    public static void main(String[] args) {
        double a = 9.5;
        double b = 2.5;

        // Array dari objek ArithmeticOperation
        ArtimatikaOperasi[] operations = {
            new Addition(a, b),
            new Subtraction(a, b),
            new Multiplication(a, b),
            new Division(a, b)
        };

        // Menampilkan hasil dari setiap operasi
        for (ArtimatikaOperasi operation : operations) {
            System.out.println("Hasil Operasi: " + operation.performOperation());
        }
        System.out.println("Hello World!");
    }
}
