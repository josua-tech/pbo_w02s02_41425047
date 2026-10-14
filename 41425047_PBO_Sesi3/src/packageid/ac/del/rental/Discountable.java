package id.ac.del.rental;

// Kontrak semua skema diskon
public interface Discountable {
    // Mengembalikan NOMINAL potongan dari total harga (amount)
    double calculateDiscount(double amount);
}