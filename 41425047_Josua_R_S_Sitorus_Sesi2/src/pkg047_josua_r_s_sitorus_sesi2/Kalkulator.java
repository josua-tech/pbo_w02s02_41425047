/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg047_josua_r_s_sitorus_sesi2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
    /*
    NIM: 41425047
    Nama: Josua R.S Sitorus!
    */

public class Kalkulator {
  public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Masukkan angka pertama: ");
       int a = input.nextInt();
       System.out.print("Masukkan angka kedua: ");
       int b = input.nextInt();

       System.out.println("Tambah: " + (a + b));
       System.out.println("Kurang: " + (a - b));
       System.out.println("Kali: " + (a * b));
       System.out.println("Bagi: " + ((double) a / b));
    }
}
    
 /*Praktek 1 – Perbedaan double asli vs hasil casting int:
Double asli menyimpan nilai lengkap dengan desimal (misal 165.8). Setelah di-casting ke int, desimalnya dibuang/dipotong (bukan dibulatkan), jadi (int) 165.8 = 165. Informasi .8 hilang permanen.
Praktek 2 – Mengapa pembagian int perlu di-casting ke double
Karena int / int di Java otomatis membuang desimal hasilnya. Contoh 7 / 3 = 2, padahal harusnya 2.33. Dengan casting salah satu operand jadi double, misal (double) a / b, hasil pembagian jadi akurat dan tetap desimal.
Praktek 2 – Risiko jika pembagi = 0:
Pembagian int / 0 → program crash, melempar ArithmeticException: / by zero.
Pembagian double / 0 → tidak crash, tapi hasilnya Infinity (atau NaN jika 0.0/0.0), yang bisa membuat data/output jadi tidak masuk akal jika tidak divalidasi.  */

