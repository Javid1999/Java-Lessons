package files;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class FileExamples {

    private static final Path FILES_DIR = Path.of("src", "files");

    public static void main(String[] args) throws IOException {

        pathExample();
        //readSmallFile();
        //writeSmallFile();
        //readAllLinesExample();
        //checkFileExample ();
        //createDirectoryExample();
        //streamFileExample();
        //fileInfoExample();
        //copyFileExample();
        //moveFileExample();
        //deleteFileExample();
        //resolveExample();

    }

    private static void pathExample(){
        Path path = Path.of("src","files","order.log");

        Path newPath = path.resolveSibling("new.txt");

        Path path_one = Path.of("src","files","order.log","newline.txt");

        Path path_two = Path.of("src","files","order.log","newlline.txt");

        System.out.println(path_one.relativize(path_two));
     //   System.out.println(newPath);

//        System.out.println("Path:");
//        System.out.println(path);
//
//        System.out.println("Absolute path");
//        System.out.println(path.toAbsolutePath());
//
//        System.out.println("File Name:");
//        System.out.println(path.getFileName());

      //  System.out.println(path.getRoot());
//        System.out.println(path.getNameCount());
//        System.out.println(path.getName(0));
//        System.out.println(path.getName(1));
    }

    private static void readSmallFile() throws IOException {
        Path path = FILES_DIR.resolve("small.txt");
        String content = Files.readString(path);
        System.out.println(content);
    }

    private static void writeSmallFile() throws IOException {
        Path path = FILES_DIR.resolve("small.txt");
        Files.writeString(path,"\nHello Java!\nThis is my file",
                StandardOpenOption.APPEND);
        System.out.println("File written successfully");
    }
    private static void readAllLinesExample() throws IOException {
        Path path = FILES_DIR.resolve("orders.log");

        List<String> lines = Files.readAllLines(path);

        for (String line : lines) {
            System.out.println(line);
        }
        System.out.println("Number of Lines: " + lines.size());
    }
    private  static void  checkFileExample () throws IOException {

        Path path = FILES_DIR.resolve("orders.log");

        System.out.println("Exists: "
        + Files.exists(path));

        System.out.println("Not Exists: "
        + Files.notExists(path));

        System.out.println("Regular file: "
        + Files.isRegularFile(path));

        System.out.println("Directory: "
        + Files.isDirectory(path));

        System.out.println("Readable: "
        + Files.isReadable(path));

        System.out.println("Writable: "
        + Files.isWritable(path));

    }

    private static void createDirectoryExample() throws IOException {
        Path directory = Path.of(
                "src",
                "files",
                "reports",
                "2026",
                "september"
        );
        Files.createDirectories(directory);

        System.out.println("Directory created successfully");
        System.out.println(directory.toAbsolutePath());
    }

    private static void streamFileExample() throws IOException {
        Path path = FILES_DIR.resolve("orders.log");

        try (Stream<String> lines = Files.lines(path)) {
            long successCount = lines
                    .filter(line -> line.contains("SUCCESS"))
                    .count();

            System.out.println("Success orders: " + successCount);
        }
    }

    private static void fileInfoExample() throws IOException {
        Path path = FILES_DIR.resolve("orders.log");

        long size = Files.size(path);
        System.out.println(
                "Size: " + size + " bytes"
        );
        System.out.println(
                "Last modified: "
                + Files.getLastModifiedTime(path)
        );
    }

    private static void copyFileExample() throws IOException {
        Path source = FILES_DIR.resolve("orders.log");

        Path target = FILES_DIR.resolve("orders_backup.log");

        Files.copy(source,
                   target,
                   StandardCopyOption.REPLACE_EXISTING
        );
        System.out.println("File copied successfully");
    }

    private static void moveFileExample() throws IOException {
        Path source = FILES_DIR.resolve("orders_backup.log");

        Path target = FILES_DIR.resolve("backup.log");

        Files.move(
                source,
                target,
                StandardCopyOption.REPLACE_EXISTING
        );
        System.out.println("File moved successfully");
    }

    private static void deleteFileExample() throws IOException {
        Path path = FILES_DIR.resolve("backup.log");

        boolean deleted = Files.deleteIfExists(path);

        System.out.println("Deleted: " + deleted);
    }

    private static void resolveExample() throws IOException {
        Path directory =
                Path.of("src","files");

        Path orders = directory.resolve("orders.log");

        Path report = directory.resolve("reports.txt");

        System.out.println(orders);
        System.out.println(report);
    }

}
