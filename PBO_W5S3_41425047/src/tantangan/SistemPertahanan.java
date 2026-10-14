/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tantangan;

import java.util.ArrayList;
import java.util.List;

// Menampung banyak mantra perlindungan (bertipe parent abstract)
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>();

    // Menambah mantra apa pun yang merupakan turunan MantraPerlindungan
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra " + mantra.nama + " ditambahkan ke sistem pertahanan.");
    }

    // Mengaktifkan semua mantra dalam satu loop (polymorphism)
    public void aktifkanSemuaMantra() {
        System.out.println("=== MENGAKTIFKAN SEMUA MANTRA ===");
        for (MantraPerlindungan m : daftarMantra) {
            m.aktifkan();
        }
    }

    // Menonaktifkan semua mantra dalam satu loop (polymorphism)
    public void nonaktifkanSemuaMantra() {
        System.out.println("=== MENONAKTIFKAN SEMUA MANTRA ===");
        for (MantraPerlindungan m : daftarMantra) {
            m.nonaktifkan();
        }
    }
}
