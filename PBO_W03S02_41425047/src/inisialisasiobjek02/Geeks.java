/*
 * Materi: Inisialisasi Objek menggunakan Method/Function (setter)
 * Sumber: PBO W3S2 halaman 7
 */

public class Geeks {

    static String name;
    static float price;

    static void set(String n, float p) {
        name = n;
        price = p;
    }

    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }

    public static void main(String args[]) {
        Geeks.set("Visual studio", 0.0f);
        Geeks.get();
    }
}

/*
 * Berbeda dari constructor, di sini nilai atribut (name, price)
 * diisi belakangan lewat method khusus bernama set() -- disebut
 */
