/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian_1_2;

/**
 *
 * @author ASUS
 */
// Josua Rananta Stariasi Sitorus
// 41425047

    // PARENT CLASS: kurir reguler (motor)
class KurirReguler {
    // protected agar bisa diakses oleh child class
    protected String nama;

    // Constructor untuk mengisi nama kurir
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method pengiriman versi darat (akan di-override oleh child)
    public void kirimBarang(String alamat) {
        System.out.println(nama + " mengantar paket ke " + alamat + " lewat jalur darat menembus kemacetan.");
    }
}

// CHILD CLASS: kurir drone mewarisi KurirReguler
class KurirDrone extends KurirReguler {
    // Atribut tambahan khusus drone
    private String idDrone;

    // Constructor: memanggil constructor parent via super(), lalu isi idDrone
    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // OVERRIDING: mengganti perilaku kirimBarang milik parent
    @Override
    public void kirimBarang(String alamat) {
        System.out.println("Unit Drone [" + idDrone + "] operator " + nama +
                " terbang mengantar paket langsung ke koordinat: " + alamat);
    }
}

// Kelas utama untuk simulasi overriding
public class SimulasiOverriding {
    public static void main(String[] args) {
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Referensi parent, objek asli parent
        KurirReguler k1 = new KurirReguler("Budi");

        // Referensi parent, objek asli child (polimorfisme)
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // JVM memilih method berdasarkan objek aslinya saat runtime
        k1.kirimBarang("Jl. Sudirman No. 10");
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/*
 * LEMBAR ANALISIS OVERRIDING
 *
 // 1. Setelah @Override dihapus dan nama method diubah menjadi kirimbarang
-(b kecil), output k2.kirimBarang("Gedung Graha Lt. 5") menjadi:
-"Arka mengantar paket ke Gedung Graha Lt. 5 lewat jalur darat menembus kemacetan."
-Jadi berubah menjadi "lewat jalur darat", karena kirimbarang dianggap
-method baru, bukan override, sehingga method milik parent yang dipakai.
 2. Setelah @Override dikembalikan di atas method typo, error yang muncul:
 -"method does not override or implement a method from a supertype"
  3. Fungsi @Override: penanda agar compiler memeriksa bahwa method benar-benar
 -menimpa method parent. Jika ada salah ketik atau parameter berbeda,
 -compiler langsung error sehingga bug ketahuan lebih awal. Selain itu
 -membuat kode lebih mudah dibaca.
 */