/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lingkaran;

import java.util.Scanner;

/**
 *
 * @author A14
 */
public class LingkaranBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();
        
        lingkaran.hitungLuas(r);
        
        input.close();
    }
    
}
