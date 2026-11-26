package patterns_matching;

import java.util.Objects;

public class human14 {

    String name;

    String surname;

    Integer money;

    public human14(String name, String surname, Integer money) {
        this.name = name;
        this.surname = surname;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        human14 human14 = (human14) o;
        return Objects.equals(getName(), human14.getName()) && Objects.equals(getSurname(), human14.getSurname()) && Objects.equals(getMoney(), human14.getMoney());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getMoney());
    }

    @Override
    public String toString() {
        return "human14{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", money=" + money +
                '}';
    }
}
