/*
 * Materi: Kombinasi toString, equals, hashCode, clone
 */

public class Book implements Cloneable {
    private String t;   // judul
    private String a;   // penulis
    private int y;       // tahun

    public Book(String t, String a, int y) {
        this.t = t;
        this.a = a;
        this.y = y;
    }

    @Override
    public String toString() {
        return t + " by " + a + " (" + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Book)) {
            return false;
        }
        Book other = (Book) o;
        return this.t.equals(other.getTitle())
                && this.a.equals(other.getAuthor())
                && this.y == other.getYear();
    }

    @Override
    public int hashCode() {
        int res = 17;
        res = 31 * res + t.hashCode();
        res = 31 * res + a.hashCode();
        res = 31 * res + y;
        return res;
    }

    @Override
    public Book clone() {
        try {
            return (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getTitle() {
        return t;
    }

    public String getAuthor() {
        return a;
    }

    public int getYear() {
        return y;
    }

    public static void main(String[] args) {
        Book b1 = new Book(
                "The Hitchhiker's Guide to the Galaxy",
                "Douglas Adams", 1979);
        System.out.println(b1);

        Book b2 = b1.clone();
        System.out.println(b2);

        System.out.println("b1 equals b2: " + b1.equals(b2));
        System.out.println("b1 hash code: " + b1.hashCode());
        System.out.println("b2 hash code: " + b2.hashCode());
    }
}

/*
 * Class Book menggabungkan 4 method penting milik Object yang
 * di-override sekaligus: toString() menampilkan detail buku dalam
 * format ringkas, equals() membandingkan dua Book berdasarkan judul,
 * penulis, dan tahun (bukan alamat memori), hashCode() menghasilkan
 * angka hash yang konsisten dengan atribut-atribut tersebut (memakai

 */
