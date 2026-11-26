package againlesson;

import java.util.Objects;

public class Animal {

     String color;
     int  leg;
     public Animal(String color, int leg) {
         this.leg = leg;
         this.color = color;

     }
     public Animal(String color) {
         this.color = color;
     }
     public Animal(int leg) {
         this.leg = leg;
     }
     public Animal(){
      }

      public int increaseLeg (int newLegCount) {
         return this.leg + newLegCount;
      }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getLeg() == animal.getLeg() && Objects.equals(getColor(), animal.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getLeg());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", leg=" + leg +
                '}';
    }
}
