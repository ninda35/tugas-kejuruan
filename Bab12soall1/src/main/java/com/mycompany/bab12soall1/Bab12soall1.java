/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab12soall1;

/**
 *
 * @author Andriyansyah
 */
public class Bab12soall1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SystemAnalyst systemAnalyst = new SystemAnalyst ("System Analyst", 400000, 100000, 40000, 50000);
        double gajiTotal = systemAnalyst.hitungGajiTotal();

        System.out.println("Gaji " + systemAnalyst.nama + " : " + systemAnalyst.gaji);
        System.out.println("Bonus               : " + systemAnalyst.bonus);
        System.out.println("Tunjangan Makan     : " + systemAnalyst.tunjanganMakan);
        System.out.println("Transport           : " + systemAnalyst.transport);
        System.out.println("Gaji Total          : " + gajiTotal);
    }
}
