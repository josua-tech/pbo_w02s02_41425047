/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eksperimen2;

/**
 * JOSUA RANANTA STARIASI SITORUS
 * 41425047
 * @author ASUS
 */



// Kelas untuk menguji polimorfisme dengan array bertipe parent class
public class SimulasiArmada {
    public static void main(String[] args) {
        System.out.println("=== TANTANGAN EKSTRA: POLIMORFISME ARMADA ===");

        // Array bertipe PARENT class (KendaraanEkspedisi),
        // diisi objek dari BERBAGAI child class
        KendaraanEkspedisi[] armada = new KendaraanEkspedisi[3];
        armada[0] = new TrukBox("B 9081 TXT", 5000);   // child 1: Truk Box
        armada[1] = new MobilVan("B 1122 KAA", 800);   // child 2: Mobil Van
        armada[2] = new MotorKurir("BK 3344 DEL", 50); // child 3: Motor Kurir

        // SATU for-loop untuk semua objek, tanpa cek jenis child secara manual
        for (int i = 0; i < armada.length; i++) {
            armada[i].infoKendaraan();                  // concrete method dari parent
            armada[i].angkutBarang("Paket Ekspedisi");  // JVM memilih versi child saat runtime
            System.out.println("---------------------------------");
        }
    }
}

/*
  LEMBAR ANALISIS ABSTRAKSI
- EKSPERIMEN 1
- Pesan error saat baris PERCOBAAN 1 dibuka komentarnya:
-"KendaraanEkspedisi is abstract; cannot be instantiated"
-Alasan: KendaraanEkspedisi hanyalah konsep/kerangka yang belum nyata
-(seperti memesan "Kendaraan Ekspedisi" di dealer tanpa menyebut jenisnya).
-Class ini punya abstract method angkutBarang() tanpa isi, sehingga jika
-objeknya dibuat, method tersebut tidak punya perilaku. Karena itu Java
- melarang pembuatan objek abstract class dengan new. Objek hanya boleh
-dibuat dari kelas konkret seperti TrukBox atau MobilVan.
 
 * EKSPERIMEN 2
 Pesan error pada class MotorKurir yang belum menulis angkutBarang():
 "MotorKurir is not abstract and does not override abstract method
 angkutBarang(String) in KendaraanEkspedisi"
 Dua opsi perbaikan yang ditawarkan IDE:
 1. Implement all abstract methods
 (IDE membuatkan method angkutBarang() otomatis di MotorKurir)
 2. Make class MotorKurir abstract
 -(MotorKurir dijadikan abstract class sehingga tidak wajib
 -mengimplementasikan angkutBarang())
 */