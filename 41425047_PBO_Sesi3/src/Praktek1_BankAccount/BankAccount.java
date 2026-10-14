// Nama : Josua Rananta Stariasi Sitorus
// NIM  : 41425047

/**
 * Kelas BankAccount menerapkan ENKAPSULASI:
 * data dibuat private, akses hanya lewat method public.
 */


public class BankAccount {
    // Atribut private: tidak bisa diubah langsung dari luar kelas
    private String accountNumber;
    private double balance;

    // Constructor: mengisi nomor rekening dan saldo awal
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        // Validasi: saldo awal tidak boleh negatif
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter nomor rekening (read-only)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter saldo (read-only)
    public double getBalance() {
        return balance;
    }

    // Mutator setor: jumlah harus positif
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Mutator tarik tunai: jumlah valid dan tidak melebihi saldo
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        } else {
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    // Method main untuk menguji program
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC-001", 500000);

        acc.deposit(-100000);   // ditolak (negatif)
        acc.withdraw(700000);   // ditolak (melebihi saldo)
        acc.withdraw(200000);   // berhasil

        System.out.println("Saldo akhir akun " + acc.getAccountNumber()
                + ": Rp" + acc.getBalance());
    }
}