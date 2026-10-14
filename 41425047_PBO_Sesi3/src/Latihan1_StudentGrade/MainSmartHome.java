// Nama : Josua Rananta Stariasi Sitorus
// NIM  : 41425047

public class MainSmartHome {
    public static void main(String[] args) {
        SmartLamp lampu = new SmartLamp(80);
        SmartAC ac = new SmartAC(22);

        // Skenario normal (sesuai contoh modul)
        lampu.turnOn();
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");

        ac.turnOn();
        ac.connectToWifi("Rumah_Indah_5G", "192.168.1.51");
        ac.turnOff();

        // Tambahan: uji aturan State (konek saat perangkat mati)
        lampu.turnOff();
        lampu.connectToWifi("Rumah_Indah_5G", "192.168.1.50");  // harus error
    }
}