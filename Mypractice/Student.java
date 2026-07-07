package Mypractice;

import java.util.Objects;

public class Student {
    private  String name;
    private  int age;
    private  int group;

    public Student(){
    }
    public Student (String name,int age,int group){
        this.name=name;
        this.age=age;
        this.group=group;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && group == student.group && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, group);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }
}
