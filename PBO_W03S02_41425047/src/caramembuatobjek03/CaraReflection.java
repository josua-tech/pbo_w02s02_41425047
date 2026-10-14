/*
 * Materi: Cara Membuat Objek #2 - Menggunakan Reflection
 */

class StudentReflect {
    public StudentReflect() {
        System.out.println("Constructor StudentReflect dipanggil");
    }
}

public class CaraReflection {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName(
                    "StudentReflect");
            StudentReflect s2 = (StudentReflect) c.getDeclaredConstructor().newInstance();
            System.out.println("Object created: " + s2);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");
        } catch (NoSuchMethodException e) {
            System.err.println("No default constructor!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * Reflection memungkinkan program membuat objek dari nama class
 * dalam bentuk String, bahkan tanpa mengetik "new StudentReflect()"
 * secara langsung dalam kode. Class.forName("StudentReflect")
 * memuat class tersebut saat runtime, lalu getDeclaredConstructor()
*/
