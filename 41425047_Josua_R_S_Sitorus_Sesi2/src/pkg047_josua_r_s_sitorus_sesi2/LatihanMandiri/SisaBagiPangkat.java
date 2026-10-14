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

import java.util.Scanner; // untuk membaca input pengguna

public class SisaBagiPangkat {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
       int sisaBagi = a % b;
        long pangkat = (long) Math.pow(a, b);
        System.out.println("Sisa bagi: " + sisaBagi);
        System.out.println("Pangkat: " + pangkat);
 
        input.close();
    }
}
 
/*
 -Program ini membaca dua bilangan bulat (a dan b) dari pengguna
 -menggunakan Scanner. Operator % dipakai untuk menghitung sisa
 -hasil bagi a oleh b, sedangkan Math.pow(a, b) dipakai untuk
 -menghitung a pangkat b — karena hasil Math.pow() bertipe double,
 -nilainya di-casting ke (long) agar tampil sebagai bilangan bulat.
 -Kedua hasil tersebut lalu ditampilkan ke layar, dan Scanner
 -ditutup di akhir program menggunakan close().
 */

