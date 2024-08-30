/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17soal1;

/**
 *
 * @author Andriyansyah
 */
import java.util.Scanner;
public class Bab17soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima jumlah kota dari pengguna
        System.out.print("Masukan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline yang tersisa setelah nextInt()

        // Membuat array untuk menyimpan nama-nama kota
        String[] kotaArray = new String[jumlahKota];

        // Menerima nama-nama kota dari pengguna
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kotaArray[i] = scanner.nextLine();
        }

        // Menutup scanner
        scanner.close();

        // Menampilkan nama-nama kota yang dimasukkan
        System.out.println("Kota-kota yang dimasukan:");
        for (String kota : kotaArray) {
            System.out.println(kota);
        }
        System.out.println("Hello World!");
    }
}
