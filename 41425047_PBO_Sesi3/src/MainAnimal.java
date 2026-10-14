/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

abstract class Animal {
    abstract void suara();

    void tidur() {
        System.out.println("Hewan sedang tidur");
    }
}

class Kucing extends Animal {
    @Override
    void suara() {
        System.out.println("Kucing berbunyi Meow");
    }
}

class Anjing extends Animal {
    @Override
    void suara() {
        System.out.println("Anjing berbunyi Guk guk");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Kucing();
        Animal a2 = new Anjing();

        a1.suara();
        a1.tidur();

        a2.suara();
        a2.tidur();
    }
}


