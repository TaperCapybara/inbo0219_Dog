package ru.mirea.inbo0219.pr1.dog;
import java.lang.*;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog ("Simon", 5);
        Dog d2 = new Dog ("Victor", 2);
        Dog d3 = new Dog ("Mike");
        Dog d4 = new Dog ();
        d3.setAge(18);
        System.out.println(d4);
        d1.intoHuman();
        d2.intoHuman();
        System.out.println(d3.toString());
    }
}
