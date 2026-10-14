// Nama : Josua Rananta Stariasi Sitorus
// NIM  : 41425047

public class SmartAC implements Switchable, Connectable {
    private int temperature;    // derajat suhu (private)
    private boolean isOn;       // status sakelar

    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("[AC Pintar] Dinyalakan pada suhu " + temperature + " C");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("[AC Pintar] Dimatikan.");
    }

    @Override
    public void connectToWifi(String ssid, String ipAddress) {
        if (!isOn) {
            System.out.println("[Error] AC Pintar tidak bisa terhubung ke WiFi karena masih MATI. Panggil turnOn() dulu!");
            return;
        }
        System.out.println("[WiFi Device] Terhubung ke jaringan: " + ssid + " (IP: " + ipAddress + ")");
    }
}