/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lingkaran;

/**
 *
 * @author A14
 */
public class Lingkaran {
    final double PI = 3.141592;
    
    void hitungLuas(double r){
        double luas = PI * r * r;
        
        System.out.println("Luas dalam bilangan pecahan: " + luas);
        System.out.println("Luas dalam bilangan bulat (type-casting): " + (int)luas);
        System.out.println("Luas setelah dibulatkan (Math.round): " + Math.round(luas));
    }
    
}
