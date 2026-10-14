// Nama : Josua Rananta Stariasi Sitorus
// NIM  : 41425047

public class MainStudent {
    public static void main(String[] args) {
        StudentGrade mhs = new StudentGrade("11425001", "Marsha");

        mhs.setNilaiKuis(110.0);  // ditolak: di luar rentang
        mhs.setNilaiKuis(85.0);   // diterima
        mhs.setNilaiUTS(90.0);    // diterima

        mhs.cetakLaporan();

        // mhs.gradeHuruf = "A";  // ERROR kompilasi (private) -> bukti enkapsulasi
    }
}