/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tantangan;

// Mantra pencegah apparition di area tertentu
class MantraAntiApparition extends MantraPerlindungan {
    private String area; // area yang dilindungi

    public MantraAntiApparition(String area) {
        super("Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        System.out.println("Anti-Apparition aktif: tidak ada yang bisa ber-apparition di " + area + ".");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Anti-Apparition di " + area + " dinonaktifkan.");
    }
}
