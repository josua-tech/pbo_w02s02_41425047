/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ASUS
 */
public class GeeksClone {
   
   class GeeksClone implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // super() mengacu ke parent class
    }

    String name = "GeeksForGeeks";

    public static void main(String[] args) throws CloneNotSupportedException {
        GeeksClone o1 = new GeeksClone();

        try {
            GeeksClone o2 = (GeeksClone) o1.clone();
            System.out.println(o2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

/* 
*Classs GeekClone menginplementasikan interface Cloneable ,yang 
*menandakan objeknya boleh digandakan lewat method clone().
 method
*clone() di sini meng- override versi bawahan object dan memanggil
*copy). Objek o2 adalah hasil kloning dari o1,sehingga nilai nilai atribut name nya ikut tersalin */