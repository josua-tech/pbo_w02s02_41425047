/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tantangan;

// Demonstrasi sistem pertahanan Hogwarts
public class DemoHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan();

        // Membuat beberapa objek mantra konkret
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Peter Pettigrew");
        MantraPerlindungan antiApparition = new MantraAntiApparition("Kastil Hogwarts");

        // Menambahkan ke sistem pertahanan
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Aktifkan dan nonaktifkan semua sekaligus
        hogwarts.aktifkanSemuaMantra();
        hogwarts.nonaktifkanSemuaMantra();
    }
}