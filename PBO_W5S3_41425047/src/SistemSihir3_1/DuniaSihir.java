/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3_1;

import java.util.ArrayList;
import java.util.List;

// ABSTRACT CLASS: kerangka semua mantra
abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    // Getter agar nama (private) bisa dibaca dari luar
    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra, diisi oleh tiap subclass
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Penyihir menyimpan daftar mantra yang sudah dipelajari
class Penyihir {
    private String nama;
    private List<Mantra> mantraList; // list bertipe parent (abstract class)

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    // Menambah mantra ke daftar; menerima mantra apa pun (polymorphism)
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    // Mencari mantra berdasarkan nama lalu menjalankan efeknya
    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek(); // versi efek() dipilih sesuai objek aslinya
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // TAMBAHAN (instruksi no. 2): ucapkan semua mantra dalam satu perintah
    public void ucapkanSemuaMantra() {
        System.out.println(nama + " mengucapkan semua mantra yang dikuasai:");
        for (Mantra mantra : mantraList) {
            System.out.println("- " + mantra.getNama());
            mantra.efek();
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // Memanggil method tambahan: ucapkan semua mantra sekaligus
        harry.ucapkanSemuaMantra();
    }
}

/*
 * JAWABAN PERTANYAAN
1. Bagaimana polymorphism dan abstract class bekerja sama?
Abstract class Mantra menetapkan "kontrak": semua mantra wajib punya efek().Penyihir hanya mengenal tipe Mantra (parent), tanpa tahu mantra konkretnya
.Saat mantra.efek() dipanggil, JVM menjalankan efek() milik objek aslinya (Expelliarmus, ExpectoPatronum, atau Lumos). Jadi abstract class  menyediakan kerangka yang seragam, polymorphism membuat setiap mantra berperilaku berbeda lewat satu pemanggilan yang sama.

2. Apa yang terjadi jika menambah mantra baru tanpa mengubah kelas Penyihir?
 Sangat mudah. Cukup buat class baru yang extends Mantra dan implementasikan efek(), lalu panggil belajarMantra(...). Kelas Penyihir tidak perlu diubah,karena hanya bergantung pada tipe abstrak Mantra, bukan mantra konkret.Inilah desain yang extensible (mudah dikembangkan).
 */