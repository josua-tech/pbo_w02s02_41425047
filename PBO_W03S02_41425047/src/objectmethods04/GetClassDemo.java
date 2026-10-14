/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectmethods04;

/**
 *
 * @author ASUS
 */
public class GetClassDemo {
    public static void main(String[] args) {
        Object o = new String("GeeksForGeeks");
        Class<?> c = o.getClass();
        System.out.println("Class of Object o is: " + c.getName());
    }
}

/*
 * getClass() mengembalikan objek Class yang merepresentasikan kelas
 * sebenarnya (runtime class) dari sebuah objek. Di sini variabel o
 * dideklarasikan bertipe Object, tetapi objek aslinya adalah String,
 * sehingga getClass().getName() mengembalikan "java.lang.String",
 */
   
