/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2_1;

import java.util.*;

// ABSTRACT CLASS: blueprint semua mantra, tidak bisa di-new langsung
abstract class MantraAbstrak {
    private String nama; // nama mantra

    // Constructor, dipanggil subclass lewat super()
    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: tanpa body, WAJIB diimplementasikan subclass
    public abstract void efek();

    // Method konkret: sudah punya isi, diwariskan ke semua mantra
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

// Subclass konkret 1
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

// Subclass konkret 2
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Subclass konkret 3 (TAMBAHAN INSTRUKSI): Lumos
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        // Referensi bertipe abstract class, objek dari subclass konkret
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos();

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();

        mantra3.ucapkan();
        mantra3.efek();

        // PERCOBAAN (pertanyaan 1): hapus // di bawah untuk melihat error
        // MantraAbstrak mantra4 = new MantraAbstrak("Test");
    }
}

/*
JAWABAN PERTANYAAN
1. Apa yang terjadi jika membuat objek MantraAbstrak langsung?
Muncul error saat kompilasi:"MantraAbstrak is abstract; cannot be instantiated"
Penyebab: MantraAbstrak adalah kerangka yang belum lengkap. Ia punya,abstract method efek() tanpa isi, sehingga kalau objeknya dibuat, efek(),tidak punya perilaku. Java melarang new pada abstract class; objek hanya,boleh dibuat dari subclass konkret (Expelliarmus, ExpectoPatronum, Lumos).
2. Mengapa perlu abstract class? Keuntungannya:
 - Memaksa semua subclass punya method tertentu (efek()), sehingga strukturnya seragam seperti SOP.
 - Kode yang sama (nama, ucapkan()) ditulis sekali di parent dan dipakai ulang oleh semua subclass.
 - Mencegah pembuatan objek yang tidak masuk akal (mantra "umum" tanpa efek).
 - Mendukung polymorphism: semua mantra bisa diperlakukan sebagai MantraAbstrak.
 */
