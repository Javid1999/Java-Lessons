package javalesson19task;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {

        Path inputDir = Path.of("payments","input");
        Path archiveDir = Path.of("payments","archive");
        Path errorsDir = Path.of("payments","error");

        Files.createDirectories(inputDir);
        Files.createDirectories(errorsDir);
        Files.createDirectories(archiveDir);

        System.out.println("Qovluqlar yaradildi.");

    }
}
