package pkg047_josua_r_s_sitorus_sesi2;

/**
 *
 * @author ASUS
 */
public class DataDiri {
    /*
    NIM: 41425047
    Nama: Josua R.S Sitorus!
    */

  public static void main(String[] args) {
      String nama = "Andi";
       int umur = 19;
      double tinggi = 165.8;
      boolean isMahasiswa = true;

      System.out.println("Nama: " + nama);
      System.out.println("Umur: " + umur + " tahun");
      System.out.println("Tinggi: " + tinggi + " cm");
      System.out.println("Status Mahasiswa: " + isMahasiswa);

        int tinggiBulat = (int) tinggi;
        System.out.println("Tinggi (dibulatkan): " + tinggiBulat + " cm");
    }
}

 /*Program membuat beberapa variabel dengan tipe data berbeda. double digunakan untuk tinggi karena dapat menyimpan angka desimal. Setelah itu, tinggi diubah menjadi 
menggunakan casting (int). Akibatnya angka di belakang koma akan hilang. */
