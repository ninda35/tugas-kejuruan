/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal1;

/**
 *
 * @author Andriyansyah
 */
import java.util.Scanner;
public class Bab6soal1 {

    public static void main(String[] args) {
       System.out.println( "Hello World!");
        // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input NIM dari pengguna 
        System.out.print("NIM ? : ");
        String nim = scanner.nextLine();
        
        // Meminta input Nama dari pengguna 
        System.out.print ("NAMA ? ");
        String nama = scanner.nextLine();
        
        // Meminta input Nilai dari pengguna 
        System.out.print("NILAI ? : ");
        int nilai = scanner.nextInt();
        
        // Menentukan grade berdasarkan nilai 
        char grade;
        if (nilai >= 85) {
        grade = 'A';
        } else if (nilai >= 70) {
        grade = 'B';
        } else if (nilai >= 55) {
        grade = 'C';
        } else if (nilai >= 40) {
        grade = 'D';
        } else {
            grade = 'E';
        }

        // Mwnampilkan output grade 
        System.out.println("Grade : " + grade);
        
        //Menutup scanner
        scanner.close();
    }
}
