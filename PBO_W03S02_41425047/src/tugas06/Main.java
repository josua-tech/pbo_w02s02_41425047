/*
 * NIM   : 41425047
 * Nama  : Josua R S Sitorus
 */
class Mahasiswa {
    String nama;
    String nim;
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Budi";
        m1.nim = "12345";

        System.out.println("Nama: " + m1.nama);
        System.out.println("NIM: " + m1.nim);
    }
}

/*
 * Class Mahasiswa hanya berisi dua atribut (nama dan nim) tanpa
 * constructor, sehingga objeknya dibuat dengan constructor bawaan
 * Java yaitu new Mahasiswa(). Setelah objek m1 terbentuk, nilai
 */
