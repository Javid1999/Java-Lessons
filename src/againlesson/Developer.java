package againlesson;

public class Developer extends Employeer {

    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\n"+ "programmingLanguage=" + programmingLanguage;
    }
}
