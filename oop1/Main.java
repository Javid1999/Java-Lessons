package oop1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal  a  = new Animal(4,"Black","Cat");

        System.out.println(a.color);
        Animal b = new Animal(4);
        System.out.println(b.increaseleg(3));
    }
}
