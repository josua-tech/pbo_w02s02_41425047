/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassDanObject01;

/**
 *
 * @author ASUS
 */

// Main.java
// Class utama yang berisi main(), titik awal program dijalankan
public class Main {
    public static void main(String[] args) {

        // Membuat objek s1 dari class Student (memanggil constructor)
        Student s1 = new Student(10, "Alice");

        // Mencetak nilai atribut objek s1
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}

