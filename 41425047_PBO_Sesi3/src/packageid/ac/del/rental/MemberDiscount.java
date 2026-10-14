package id.ac.del.rental;

// Diskon member: 10%
public class MemberDiscount implements Discountable {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}