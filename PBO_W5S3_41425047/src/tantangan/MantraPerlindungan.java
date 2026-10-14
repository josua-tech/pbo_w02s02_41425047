/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tantangan;

// ABSTRACT CLASS: kerangka semua mantra perlindungan
abstract class MantraPerlindungan {
    protected String nama; // nama mantra, bisa diakses subclass

    public MantraPerlindungan(String nama) {
        this.nama = nama;
    }

    // Abstract method: wajib diisi oleh setiap mantra konkret
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}
