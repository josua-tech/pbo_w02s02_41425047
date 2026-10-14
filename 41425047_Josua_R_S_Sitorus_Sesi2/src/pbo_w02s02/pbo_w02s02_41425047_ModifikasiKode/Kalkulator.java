/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_w02s02.pbo_w02s02_41425047_ModifikasiKode;
import java.util.Scanner;
  /*
    NIM: 41425047
    Nama: Josua R.S Sitorus!
    */

public class Kalkulator {
    public static int pangkat(int a, int b){
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
    
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("Tambah: " + (a + b));
        System.out.println("Kurang: " + (a - b));
        System.out.println("Kali: " + (a * b));
        System.out.println("Bagi: " + (double)a / b);
        System.out.println("Modulus: " + a % b);
        System.out.println("Pangkat: " + pangkat(a, b));
    }    
}

