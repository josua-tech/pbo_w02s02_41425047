package id.ac.del.rental;

// Diskon flash sale: 25%
public class FlashSaleDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.25;
    }
}