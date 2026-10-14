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

public class RataRataNilai {
  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan nilai 1: ");
       double nilai1 = input.nextDouble();
       System.out.print("Masukkan nilai 2: ");
       double nilai2 = input.nextDouble();
       System.out.print("Masukkan nilai 3: ");
        double nilai3 = input.nextDouble();
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        System.out.printf("Rata-rata: %.2f%n", rataRata);
        input.close();
    }
}


/*
 - Scanner   : membaca input dari keyboard.
 - nilai1-3  : bertipe double agar bisa menampung desimaldan hasil rata-rata nanti otomatis presisi.
 - rataRata  : jumlah ketiga nilai dibagi 3.
 - printf    : menampilkan hasil dengan 2 angka desimal (%.2f).
 - close()   : menutup Scanner setelah tidak dipakai lagi.
 Alur: input 3 nilai -> jumlahkan -> bagi 3 -> tampilkan hasil.
 
 */