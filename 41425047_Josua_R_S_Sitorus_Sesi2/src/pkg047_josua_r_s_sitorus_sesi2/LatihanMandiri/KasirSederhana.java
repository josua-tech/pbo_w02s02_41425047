/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg047_josua_r_s_sitorus_sesi2.LatihanMandiri;
import java.util.Scanner;

/*
 * NIM   : 41425047
 * Nama  : Josua R.S Sitorus!
 */

public class KasirSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama barang: ");
        String NamaBarang = input.nextLine();
        System.out.println("Masukkan harga barang: ");
        int HargaBarang = input.nextInt();
        System.out.println("Masukkan jumlah beli: ");
        int JumlahBeli = input.nextInt();
        
        double TotalHargaBeli = HargaBarang * JumlahBeli;
        System.out.println("Total harga sebelum diskon: " + TotalHargaBeli);
        if(TotalHargaBeli >= 100000) {
            double HargaDiskon = TotalHargaBeli / 10;
            System.out.println("Diskon: " + HargaDiskon);
        System.out.println("Total Bayar: " + (TotalHargaBeli - HargaDiskon));
            
        } else {
            double HargaDiskon = 0;
            System.out.println("Diskon: " + HargaDiskon);
        System.out.println("Total Bayar: " + (TotalHargaBeli - HargaDiskon));
        } 
    }
}
