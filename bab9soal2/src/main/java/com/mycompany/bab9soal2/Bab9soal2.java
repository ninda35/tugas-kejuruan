/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;

/**
 *
 * @author Andriyansyah
 */
import java.util.Scanner;

public class Bab9soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        // Input nilai awal dan nilai ahir 
        System.out.println("Masukan bilangan awal: ");
        int awal = scanner.nextInt();
        
        System.out.println("Masukan bilangan akhir: ");
        int akhir = scanner.nextInt();
        
        // Menampilkan hasil deret bilangan 
        System.out.println("hasil deret bilangan: ");
        for (int i = awal; i <= akhir; i+= 5) {
            System.out.println(i);
            if (i + 5 <= akhir) {
                System.out.println(", ");
            }
        }
    }
}
