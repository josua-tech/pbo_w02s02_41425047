/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1_2;

import java.util.*;

// PARENT CLASS: penyihir umum
class Penyihir {
    // Method yang akan di-override oleh child class
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// CHILD 1: Harry Potter meng-override ucapkanMantra()
class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// CHILD 2: Hermione meng-override ucapkanMantra()
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// CHILD 3 (TAMBAHAN INSTRUKSI): Ron Weasley dengan gayanya sendiri
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan semangat, meski tongkatnya kadang bermasalah.");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        // Referensi bertipe parent, objek aslinya child (POLIMORFISME)
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();

        // JVM memilih versi method sesuai objek aslinya saat runtime
        penyihir1.ucapkanMantra();
        penyihir2.ucapkanMantra();
        penyihir3.ucapkanMantra();
    }
}

/*
  JAWABAN PERTANYAAN
  1. Apa yang terjadi jika tidak memakai @Override? Apakah kode masih berjalan?
Kode MASIH berjalan dan hasilnya sama, selama nama dan parameter method
persis sama dengan method parent. @Override hanya anotasi untuk compiler,
 bukan syarat overriding. Bedanya, tanpa @Override, kalau terjadi salah ketik,(misalnya ucapkanmantra), compiler tidak memberi error dan method tersebut dianggap method baru, sehingga bug tidak terdeteksi.
  2. Keuntungan polymorphism pada contoh ini:
 - Satu variabel bertipe Penyihir bisa menampung berbagai jenis penyihir,dan pemanggilan ucapkanMantra() otomatis menjalankan versi yang sesuai.
 - Menambah penyihir baru (seperti RonWeasley) tidak perlu mengubah kodepemanggil yang sudah ada.
 - Kode lebih ringkas, tidak perlu if-else untuk mengecek jenis penyihir.
 */
