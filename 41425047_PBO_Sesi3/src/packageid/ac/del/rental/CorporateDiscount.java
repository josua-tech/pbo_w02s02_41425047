package id.ac.del.rental;

// Diskon korporat: 15%
public class CorporateDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}