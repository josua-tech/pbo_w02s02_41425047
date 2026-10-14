package id.ac.del.test;

import id.ac.del.rental.*;

public class TestRental {
    public static void main(String[] args) {
        VehicleRental v = new VehicleRental("BK 1234 DEL", 250000);

        // v.plateNumber = "";        // ERROR kompilasi (private)
        // v.rentalRatePerDay = -500; // ERROR kompilasi (private)

        v.setRentalDays(-7);          // ditolak oleh validasi
        v.setRentalDays(4);           // diterima: subtotal 1.000.000

        // Objek diskon berbeda dikirim lewat tipe interface
        Discountable member    = new MemberDiscount();
        Discountable flashSale = new FlashSaleDiscount();
        Discountable corporate = new CorporateDiscount();

        System.out.println("Tanpa diskon   : Rp" + v.getTotalCost(null));
        System.out.println("Member (10%)   : Rp" + v.getTotalCost(member));
        System.out.println("Flash Sale(25%): Rp" + v.getTotalCost(flashSale));
        System.out.println("Corporate (15%): Rp" + v.getTotalCost(corporate));
    }
}