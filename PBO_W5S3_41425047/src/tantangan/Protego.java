/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tantangan;

// Mantra perisai pelindung
class Protego extends MantraPerlindungan {
    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego menghilang.");
    }
}
