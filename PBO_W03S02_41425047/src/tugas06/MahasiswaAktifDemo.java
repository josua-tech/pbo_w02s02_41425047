/*
 * NIM   : 41425047
 * Nama  : Josua R S Sitorus
 
 */

class Mahasiswa {
    String nama;
    String nim;
}

 class MahasiswaAktif extends Mahasiswa {
    int semester;

    void belajar() {
        System.out.println(nama + " sedang belajar di semester " + semester);
    }
}

public class MahasiswaAktifDemo {
    public static void main(String[] args) {
        MahasiswaAktif m1 = new MahasiswaAktif();
        m1.nama = "Dina";
        m1.nim = "123456";
        m1.semester = 5;

        System.out.println("Nama: " + m1.nama);
        System.out.println("NIM: " + m1.nim);
        m1.belajar();
    }
}

/*
 * MahasiswaAktif menggunakan "extends Mahasiswa" sehingga otomatis
 * mewarisi atribut nama dan nim dari class induk, tanpa perlu
 * menulis ulang. Objek m1 dibuat dari MahasiswaAktif, kemudian
 */
