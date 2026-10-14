/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eksperimen2;

/**
 *
 * @author ASUS
 */


// Subclass konkret: Motor Kurir (versi final setelah diperbaiki)
class MotorKurir extends KendaraanEkspedisi {
    public MotorKurir(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi method abstract dengan gaya motor
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Motor [" + noPolisi + "] membawa '" + namaBarang +
                "' di box belakang menembus gang sempit.");
    }
}
