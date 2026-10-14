/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 * Materi: Class dan Object - Deklarasi Class Dasar
 * Sumber: PBO W3S2 halaman 3
 * Nama  : Josua Rananta Stariasi Sitorus
 */

class Student {
    int id;
    String n;

    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

public class ClassDasarDemo {
    public static void main(String[] args) {
        Student s1 = new Student(10, "Alice");

        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}

/*
 * Class Student adalah blueprint yang mendefinisikan atribut id dan
 * n (nama), serta constructor untuk mengisi nilai awal keduanya
 * menggunakan kata kunci this (merujuk ke objek yang sedang dibuat).
*/
