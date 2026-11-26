package Sorting;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String firstName;
    private int age;

    public Student(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && Objects.equals(getFirstName(), student.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getAge());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.getAge());
    }
}
