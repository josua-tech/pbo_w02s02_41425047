package id.ac.del.rental;

public class VehicleRental {
    // Semua atribut private -> tidak bisa diubah langsung dari package lain
    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;

    // Constructor memvalidasi data: objek tidak boleh dibuat dalam kondisi tidak valid
    public VehicleRental(String plateNumber, double rate) {
        if (plateNumber == null || plateNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Plat nomor tidak boleh kosong!");
        }
        if (rate <= 0) {
            throw new IllegalArgumentException("Tarif sewa per hari harus lebih dari 0!");
        }
        this.plateNumber = plateNumber;
        this.rentalRatePerDay = rate;
    }

    // Getter (read-only) untuk plat dan tarif
    public String getPlateNumber() { return plateNumber; }
    public double getRentalRatePerDay() { return rentalRatePerDay; }

    // Setter dengan validasi: hari sewa harus > 0
    public void setRentalDays(int days) {
        if (days > 0) {
            this.rentalDays = days;
        } else {
            System.out.println("[Error] Jumlah hari sewa harus lebih dari 0! (input: " + days + ")");
        }
    }

    // Menerima parameter bertipe INTERFACE -> polimorfisme saat runtime
    public double getTotalCost(Discountable discount) {
        double subtotal = rentalRatePerDay * rentalDays;

        // Jika tidak ada diskon (null), potongan = 0
        double potongan = (discount == null) ? 0 : discount.calculateDiscount(subtotal);

        // Pengaman: potongan tidak boleh negatif atau melebihi subtotal
        if (potongan < 0) potongan = 0;
        if (potongan > subtotal) potongan = subtotal;

        return subtotal - potongan;
    }
}