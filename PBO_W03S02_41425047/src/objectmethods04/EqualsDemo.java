/*
 * Materi: Method equals() milik Class Object
 */

public class EqualsDemo {

    int roll;

    @Override
    public boolean equals(Object o) {
        if (o instanceof EqualsDemo) {
            return this.roll == ((EqualsDemo) o).roll;
        }
        return false;
    }

    public static void main(String[] args) {
        EqualsDemo s1 = new EqualsDemo();
        s1.roll = 101;

        EqualsDemo s2 = new EqualsDemo();
        s2.roll = 101;

        EqualsDemo s3 = new EqualsDemo();
        s3.roll = 102;

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s3): " + s1.equals(s3));
    }
}

/*
 * Secara default, equals() pada class Object hanya membandingkan
 * apakah dua variabel menunjuk ke objek yang sama persis di memori
 * (sama seperti operator ==). Di sini equals() di-override agar dua
 */
