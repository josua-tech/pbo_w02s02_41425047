/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InisialisasiObjek_Dog02;

/**
 *
 * @author ASUS
 */

//NAMA : Josua Rananta Stariasi Sitorus
//NIM  : 41425047

public class Dog {
    // Atribut (state)
    String name;
    String breed;
    int age;
    String color;

    // Constructor: mengisi semua atribut saat objek dibuat
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    // Getter: method untuk mengambil nilai atribut (behavior)
    public String getName()  { return name; }
    public String getBreed() { return breed; }
    public int getAge()      { return age; }
    public String getColor() { return color; }

    // Meng-override toString() milik class Object agar objek tercetak rapi
    @Override
    public String toString() {
        return "Name is: " + this.getName()
             + "\nBreed, age, and color are: "
             + this.getBreed() + "," + this.getAge()
             + "," + this.getColor();
    }

    public static void main(String[] args) {
        // Membuat objek Dog dengan operator new (memanggil constructor)
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
}


