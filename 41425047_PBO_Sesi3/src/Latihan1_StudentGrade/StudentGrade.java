// Nama : Josua Rananta Stariasi Sitorus
// NIM  : 41425047

public class StudentGrade {
    // Semua atribut private
    private final String nim;       // read-only: hanya getter, tanpa setter
    private final String nama;      // read-only
    private double nilaiKuis;
    private double nilaiUTS;
    private String gradeHuruf;      // read-only, dihitung otomatis (tantangan)

    // Constructor: NIM dan Nama hanya bisa diisi di sini
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiKuis = 0;
        this.nilaiUTS = 0;
        updateGradeHuruf();         // hitung grade awal
        System.out.println("[Registrasi] Berhasil mendaftarkan mahasiswa: " + nim + " - " + nama);
    }

    // Getter saja (tanpa setter) untuk NIM dan Nama
    public String getNim() { return nim; }
    public String getNama() { return nama; }

    // Getter nilai
    public double getNilaiKuis() { return nilaiKuis; }
    public double getNilaiUTS() { return nilaiUTS; }

    // Getter gradeHuruf (tanpa setter -> tidak bisa diubah dari luar)
    public String getGradeHuruf() { return gradeHuruf; }

    // Setter nilai kuis dengan validasi rentang 0.0 - 100.0
    public void setNilaiKuis(double nilai) {
        if (nilai >= 0.0 && nilai <= 100.0) {
            this.nilaiKuis = nilai;
            System.out.println("[Update] Nilai kuis berhasil diubah menjadi: " + nilai);
            updateGradeHuruf();     // grade otomatis dihitung ulang
        } else {
            System.out.println("[Error] Nilai kuis tidak valid: " + nilai + " (Harus antara 0 - 100)");
        }
    }

    // Setter nilai UTS dengan validasi yang sama
    public void setNilaiUTS(double nilai) {
        if (nilai >= 0.0 && nilai <= 100.0) {
            this.nilaiUTS = nilai;
            System.out.println("[Update] Nilai UTS berhasil diubah menjadi: " + nilai);
            updateGradeHuruf();
        } else {
            System.out.println("[Error] Nilai UTS tidak valid: " + nilai + " (Harus antara 0 - 100)");
        }
    }

    // Hitung nilai akhir: 40% kuis + 60% UTS
    public double hitungNilaiAkhir() {
        return (0.4 * nilaiKuis) + (0.6 * nilaiUTS);
    }

    // Method PRIVATE: hanya dipanggil dari dalam kelas ini
    private void updateGradeHuruf() {
        double akhir = hitungNilaiAkhir();
        if (akhir >= 85)      gradeHuruf = "A";
        else if (akhir >= 70) gradeHuruf = "B";
        else if (akhir >= 55) gradeHuruf = "C";
        else if (akhir >= 40) gradeHuruf = "D";
        else                  gradeHuruf = "E";
    }

    // Cetak laporan hasil studi
    public void cetakLaporan() {
        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Grade      : " + gradeHuruf);
    }
}