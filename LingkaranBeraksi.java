/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

import java.util.Scanner;

public class LingkaranBeraksi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();
        
        System.out.print("Masukkan jari-jari lingkaran: ");
        double r = input.nextDouble();
        
        lingkaran.hitungLuas(r);
        
        input.close();
    }
}
