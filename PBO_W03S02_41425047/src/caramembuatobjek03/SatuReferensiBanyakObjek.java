/*
 * Materi: Membuat Beberapa Objek dengan Satu Jenis Referensi
 */

class Animal {
    void suara() {
        System.out.println("Animal bersuara");
    }
}

class Dog2 extends Animal {
    @Override
    void suara() {
        System.out.println("Dog: Guk guk!");
    }
}

class Cat2 extends Animal {
    @Override
    void suara() {
        System.out.println("Cat: Meong!");
    }
}

public class SatuReferensiBanyakObjek {
    public static void main(String[] args) {
        Animal obj = new Dog2(); 
        obj.suara();

        obj = new Cat2(); 
        obj.suara();
    }
}

/*
 * Variabel obj bertipe Animal (kelas induk) dapat menampung objek
 * dari subclass mana pun (Dog2 atau Cat2) karena keduanya adalah
 * turunan Animal. Dengan cara ini kita tidak perlu membuat variabel
 */

