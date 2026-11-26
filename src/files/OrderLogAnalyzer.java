
package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static files.OrderStatus.FAILED;
import static files.OrderStatus.SUCCESS;

public class OrderLogAnalyzer {
    public static void main(String[] args) {
        Path inputFile = Path.of("src","files","orders.log");
        Path outputFile = Path.of("src","files","report.txt");

        int successCount = 0;
        int errorCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(inputFile)){
            String line;

            while ((line = reader.readLine()) != null){
                String[] parts = line.split(",");

                String status =parts[1];
                if (SUCCESS.name().equals(status)){
                    successCount++;
                } else if (FAILED.name().equals(status)){
                    errorCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage() );
            return;
        }

        try (BufferedWriter writer = Files.newBufferedWriter(outputFile)){
            writer.write("Order Report");
            writer.newLine();

            writer.write("-----------------");
            writer.newLine();

            writer.write("SUCCESS: " +successCount);
            writer.newLine();

            writer.write("FAILED: " +errorCount);
            writer.newLine();

            writer.write("TOTAL: " +(successCount+ errorCount));

        }
        catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage() );
        }


    }
}
