package comparable;

import java.util.Objects;

public class Intern implements Comparable<Intern> {

    private String name;
    private Integer grade;

    public Intern(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Intern intern = (Intern) o;
        return Objects.equals(getName(), intern.getName()) && Objects.equals(getGrade(), intern.getGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getGrade());
    }

    @Override
    public String toString() {
        return "Intern{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
    @Override
    public int compareTo(Intern o) {
        return Integer.compare(o.grade, this.grade);
    }
}
