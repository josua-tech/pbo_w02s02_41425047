/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1_1;

import java.util.*;

// Kelas Mantra: satu nama method (ucapkan) dengan banyak versi (OVERLOADING)
public class Mantra {

    // Overload 1: satu parameter (nama mantra saja)
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload 2: dua parameter (String, int)
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload 3: tiga parameter (String, int, String)
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // TAMBAHAN (instruksi no. 2): overload dengan (String namaMantra, String target)
    // tanpa parameter kekuatan
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: " + target + " terkena mantra " + namaMantra + ".");
    }

    // TAMBAHAN (pertanyaan 2): urutan parameter dibalik (int, String)
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    public static void main(String[] args) {
        Mantra mantra = new Mantra(); // membuat objek Mantra

        mantra.ucapkan("Expelliarmus");                // versi 1
        mantra.ucapkan("Expelliarmus", 5);             // versi 2
        mantra.ucapkan("Expelliarmus", 15, "Voldemort"); // versi 3
        mantra.ucapkan("Expelliarmus", "Voldemort");   // versi baru (String, String)
        mantra.ucapkan(15, "Expelliarmus");            // versi baru (int, String)
    }
}

/*
  JAWABAN PERTANYAAN
 1. Apa yang terjadi jika method dengan dua parameter (String, int) dihapus?
 Pemanggilan mantra.ucapkan("Expelliarmus", 5) menjadi error saat kompilasi
 -("no suitable method found for ucapkan(String,int)"), karena tidak ada lagi
 -method yang cocok dengan signature (String, int). Compiler hanya mencari
 -  method yang signature-nya cocok, tidak bisa menebak versi lain.
  2. Bisakah overloading dengan urutan parameter berbeda?
 -Bisa. ucapkan(int kekuatan, String namaMantra) sah karena urutan tipe
 -parameternya (int, String) berbeda dari (String, int), sehingga signature-nya
 -berbeda. Ini tetap overloading yang valid.
 */
