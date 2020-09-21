package ru.mirea.inbo0219.pr1.dog;
import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog (String name) {
        this.name = name;
        this.age = 0;
    }

    public Dog () {
        this.name = "Pup";
        this.age = 0;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getName (){
        return this.name;
    }

    public int getAge (){
        return this.age;
    }

    @Override
    public String toString () {
        return this.name + ", age " + this.age;
    }

    public void intoHuman() {
        System.out.println(name + "'s age in human years is " + age*7 + " years.");
    }
}
