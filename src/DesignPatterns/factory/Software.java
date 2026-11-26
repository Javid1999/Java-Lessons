package DesignPatterns.factory;

public class Software {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryByLanguage(ProgrammingLanguage.PYTHON);
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();

    }

    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
            case PYTHON -> new PythonDeveloperFactory();
        };
    }
}
