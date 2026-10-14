// Nama : Josua Rananta Stariasi Sitorus
// NIM  : 41425047

// Interface = kontrak yang wajib diikuti semua metode pembayaran
interface PaymentMethod {
    // Konstanta (otomatis public static final)
    double TRANSACTION_FEE = 2500.0;

    void pay(double amount);          // deklarasi metode bayar
    String getPaymentDetails();       // deklarasi metode detail
}

// Implementasi 1: pembayaran lewat E-Wallet
class EWalletPayment implements PaymentMethod {
    private String phoneNumber;       // data dibungkus (private)

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(double amount) {
        // E-Wallet dikenai biaya admin
        double total = amount + TRANSACTION_FEE;
        System.out.println("[E-Wallet " + phoneNumber + "] Pembayaran diproses: Rp" + amount
                + " (Biaya admin: Rp" + TRANSACTION_FEE + ") | Total: Rp" + total);
    }

    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}

// Implementasi 2: pembayaran lewat Kartu Kredit
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        // Kartu kredit: tanpa biaya admin, hanya verifikasi
        System.out.println("[Credit Card " + cardNumber
                + "] Pembayaran berhasil diverifikasi sebesar: Rp" + amount);
    }
 
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}

// Kelas utama
public class PaymentSystem {
    public static void main(String[] args) {
        // Referensi bertipe INTERFACE (polimorfisme)
        PaymentMethod payment1 = new EWalletPayment("08123456789");
        PaymentMethod payment2 = new CreditCardPayment("4111-XXXX-XXXX-1234");

        // Perintah sama (pay), perilaku berbeda
        payment1.pay(50000);
        payment2.pay(150000);
    }
}