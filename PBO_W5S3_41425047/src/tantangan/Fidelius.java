/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tantangan;

// Mantra Fidelius: butuh penyihir sebagai Secret Keeper
class Fidelius extends MantraPerlindungan {
    private String secretKeeper; // penyihir penjaga rahasia

    public Fidelius(String secretKeeper) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius aktif. Secret Keeper: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan. Rahasia tidak lagi dijaga oleh " + secretKeeper + ".");
    }
}