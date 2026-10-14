/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InisialisasiObjek_Method03;

/**
 *
 * @author ASUS
 */

//NAMA : Josua Rananta Stariasi Sitorus
//NIM  : 41425047


public class Geeks {
    static String name;
    static float price;

    // Method initializer / setter: mengatur nilai atribut
    static void set(String n, float p) {
        name = n;
        price = p;
    }

    // Method untuk menampilkan nilai atribut
    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String[] args) {
        Geeks.set("Visual studio", 0.0f);  // isi nilai
        Geeks.get();                       // tampilkan nilai
    }
}


