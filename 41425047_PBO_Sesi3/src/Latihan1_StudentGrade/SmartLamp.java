// Nama : Josua Rananta Stariasi Sitorus
// NIM  : 41425047

// SmartLamp mengimplementasikan DUA interface sekaligus
public class SmartLamp implements Switchable, Connectable {
    private int brightness;     // persentase kecerahan (private)
    private boolean isOn;       // status sakelar (State)

    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;      // awalnya mati
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[Lampu Pintar] Dinyalakan dengan kecerahan " + brightness + "%");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        // State Management: tolak jika perangkat masih mati
        if (!isOn) {
            System.out.println("[Error] Lampu Pintar tidak bisa terhubung ke WiFi karena masih MATI. Panggil turnOn() dulu!");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}