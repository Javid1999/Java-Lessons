package oop1;

public class Animal {
    int leg ;
    String color;
    String name;
     public Animal(){
     }
     public Animal(int leg, String color, String name){
         this.leg = leg;
         this.color = color;
         this.name = name;
     }
     public Animal(int leg){
         this.leg = leg;
     }
     public int increaseleg(int newlegCount){
         return this.leg + newlegCount;
     }
}
