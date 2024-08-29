/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal1111;

/**
 *
 * @author Andriyansyah
 */
import java.util.Scanner;
public class Bab5soal1111 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("##Pendataan Karyawan PT. Petani Kode##");
        System.out.println("Nama Karyawan :");
        String nama = scanner.nextLine();
        
        System.out.println("Usia : ");
        int usia = scanner.nextInt();
        
        System.out.println("Gaji: ");
        int gaji = scanner.nextInt();
        
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Gaji : " + gaji);
    }
}
