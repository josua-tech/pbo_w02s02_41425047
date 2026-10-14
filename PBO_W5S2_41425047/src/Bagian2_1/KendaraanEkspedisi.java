/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2_1;

/**
 *
 * @author ASUS
 */
// Josua Rananta Stariasi Sitorus
// 41425047

// ABSTRACT CLASS: blueprint kendaraan, tidak boleh di-new langsung
abstract class KendaraanEkspedisi {
    // Atribut yang diwariskan ke semua kendaraan
    protected String noPolisi;
    protected int kapasitasKg;

    // Constructor, dipanggil oleh subclass lewat super()
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method: punya body, langsung bisa dipakai semua subclass
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method: tanpa body, WAJIB diimplementasikan subclass konkret
    public abstract void angkutBarang(String namaBarang);
}

// SUBCLASS KONKRET 1: Truk Box
class TrukBox extends KendaraanEkspedisi {
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg); // meneruskan data ke constructor parent
    }

    // Implementasi method abstract dengan gaya truk
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang +
                "' ke dalam kontainer tertutup pendingin.");
    }
}

// SUBCLASS KONKRET 2: Mobil Van
class MobilVan extends KendaraanEkspedisi {
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi method abstract dengan gaya van
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang +
                "' di bagasi belakang untuk distribusi kota.");
    }
}
    

