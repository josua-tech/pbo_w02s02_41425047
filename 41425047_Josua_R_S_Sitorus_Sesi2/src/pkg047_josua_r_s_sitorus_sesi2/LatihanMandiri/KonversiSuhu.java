/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg047_josua_r_s_sitorus_sesi2.LatihanMandiri;

/**
 *
 * @author ASUS
 */

/*
 * NIM   : 41425047
 * Nama  : Josua R.S Sitorus!
 */

import java.util.Scanner;
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // --- Konversi Celsius ke Fahrenheit ---
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();
        // Rumus konversi C ke F
        double fahrenheitHasil = (celsius * 9.0 / 5.0) + 32;
        System.out.println(celsius + " C = " + fahrenheitHasil + " F");
 
        // --- Konversi Fahrenheit ke Celsius ---
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        // Rumus konversi F ke C
        double celsiusHasil = (fahrenheit - 32) * 5.0 / 9.0;
        // Dibulatkan 2 angka desimal agar output rapi
        System.out.printf("%.1f F = %.2f C%n", fahrenheit, celsiusHasil);
 
        input.close();
    }
}

