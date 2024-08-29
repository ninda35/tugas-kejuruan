/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal1;

/**
 *
 * @author Andriyansyah
 */
import java.util.Scanner;
public class Bab8soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai awal dan nilai akhir 
        System.out.println("Nilai Awal ? : ");
        int nilaiAwal = scanner.nextInt();
        
        System.out.println("Nilai Akhir ? : ");
        int nilaiAkhir = scanner.nextInt();
        
        // Menampilkan bilangan pertambahan s
        int jumlah = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
        System.out.println(jumlah + " . " + 1);
        jumlah++;
        
        // Menutup Scanner 
        scanner.close();
    }
        System.out.println("Hello World!");
    }
}
