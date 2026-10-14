/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eksperimen2;

/**
 *
 * @author ASUS
 */

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