package serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
       String fileName =
                System.getProperty("user.dir")
                + File.separator
                +"serializedFile.txt";
       // serialize(fileName);
        deserialize(fileName);
    }
    private static void serialize(String fileName) {
        User user = new User(1, "John", "a");

        try (FileOutputStream fileOutputStream =
                     new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(user);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        private static void deserialize(String fileName){

            try (
                    FileInputStream fileInputStream =
                        new FileInputStream(fileName);

                ObjectInputStream objectInputStream =
                        new ObjectInputStream(fileInputStream)
            ) {

              User user =(User) objectInputStream.readObject();

              System.out.println(user);
             } catch (IOException | ClassNotFoundException e){
                e.printStackTrace();
            }
            }

    }

