package genericclasses;

public class Main {
    public static void main(String[] args) {

         GenericEmployee<Integer,String> genericEmployee1 = new GenericEmployee<>(2,100,"Javid");
         GenericEmployee<Integer,String> genericEmployee  = new GenericEmployee<>(1,5500,"Cavid");

         String name = genericEmployee1.getName();

        System.out.println(name);

    }
}
