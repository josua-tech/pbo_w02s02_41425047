/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object_finalize07d;

/**
 *
 * @author ASUS
 */

public class Geeks {
    @SuppressWarnings({"deprecation", "removal"})
    @Override
    protected void finalize() {
        System.out.println("finalize method called");
    }

    public static void main(String[] args) {
        Geeks t = new Geeks();
        System.out.println(t.hashCode());

        t = null;        // tidak ada lagi referensi ke objek -> layak di-GC
        System.gc();     // meminta JVM menjalankan Garbage Collector

        System.out.println("end");
    }
}


