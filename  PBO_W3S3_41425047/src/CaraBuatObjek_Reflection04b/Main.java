/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaraBuatObjek_Reflection04b;

/**
 *
 * @author ASUS
 */

//NAMA : Josua Rananta Stariasi Sitorus
//NIM  : 41425047

public class Main {
    public static void main(String[] args) {
        try {
            // Mencari class "Student" saat program berjalan
            Class<?> c = Class.forName("Student");

            // Mengambil constructor tanpa parameter lalu membuat instance
            Student s2 = (Student) c.getDeclaredConstructor().newInstance();
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


