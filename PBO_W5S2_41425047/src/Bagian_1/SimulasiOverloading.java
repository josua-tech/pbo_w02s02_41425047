/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1;

/**
 *
 * @author ASUS
 */

// Josua Rananta Stariasi Sitorus
// 41425047

    // Kelas yang menyimpan logika perhitungan tarif pengiriman
class MesinTarif {
    // Atribut kota asal pengiriman (private = hanya bisa diakses dalam class ini)
    private String kotaAsal;

    // Constructor: mengisi kotaAsal saat objek dibuat
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // OVERLOAD 1: ongkir dasar berdasarkan berat saja (Rp 10.000 per Kg)
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // OVERLOAD 2: ongkir + asuransi (1% dari nilai barang)
    public double hitungOngkir(double beratKg, double nilaiBarang) {
        double biayaAsuransi = nilaiBarang * 0.01;
        return (beratKg * 10000) + biayaAsuransi;
    }

    // OVERLOAD 3: ongkir dengan opsi express (tambahan Rp 20.000)
    public double hitungOngkir(double beratKg, boolean isExpress) {
        double total = beratKg * 10000;
        if (isExpress) {
            total += 20000; // biaya tambahan pengiriman prioritas
        }
        return total;
    }
}

// Kelas utama untuk menjalankan simulasi overloading
public class SimulasiOverloading {
    public static void main(String[] args) {
        // Membuat objek MesinTarif dengan kota asal Medan
        MesinTarif tarif = new MesinTarif("Medan");

        System.out.println("=== INI METHOD OVERLOADING ===");
        // Memanggil versi 1 (1 parameter double)
        System.out.println("Ongkir Biasa (2.0 Kg)        : Rp " + tarif.hitungOngkir(2.0));
        // Memanggil versi 2 (double, double)
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp " + tarif.hitungOngkir(2.0, 5000000.0));
        // Memanggil versi 3 (double, boolean)
        System.out.println("Ongkir Express (2.0 Kg)      : Rp " + tarif.hitungOngkir(2.0, true));
    }
}
    
/*
 * LEMBAR ANALISIS OVERLOADING
  1. Compiler memeriksa signature method (nama, jumlah, tipe, dan urutan
     parameter). Semua itu sudah diketahui saat kompilasi, sehingga method
     yang dipanggil bisa ditentukan sebelum program berjalan.
 * 2. Method int hitungOngkir(double) ditolak karena return type bukan bagian
     dari signature. Parameternya sama dengan hitungOngkir(double) yang sudah
    ada, sehingga dianggap duplikat dan pemanggilannya akan ambigu.
    Error: method hitungOngkir(double) is already defined in class MesinTarif
 */