/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;

/**
 *
 * @author Andriyansyah
 */
import java.util.Scanner;

public class Bab7soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        // Membaca input dari pengguna 
        Scanner scanner = new Scanner(System.in);
        
        // Input NIM
        System.out.println("NIM: ");
        String nim = scanner.nextLine();
        
        // Input Nama 
        System.out.println("NAMA : ");
        String nama = scanner.nextLine();
        
        // Input Nama 
        System.out.println("TAHUN :");
        int tahun = scanner.nextInt();
        scanner.nextLine();
        
        // Input Pilih Peminatan 
        System.out.println("PILIH PRMINATAN (M/J) : ");
        char peminatan = scanner.nextLine() .charAt (0);
        
        // Menentukan output berdasarkan pilihan peminatan 
        String peminatanOutput;
        switch (peminatan) {
            case 'M':
                peminatanOutput = " PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA ";
                break;
            case 'J':
                peminatanOutput = " PEMOGRAMAN JAVA, PEMOGRAMAN MOBILE ";
                break;
            default:
                peminatanOutput = "Pilihan peminatan tidak valid";
                break;
                
        }
        
        // Menampilkan hasil 
        System.out.println("\nOutput");
        System.out.println(peminatanOutput);
    }
}
