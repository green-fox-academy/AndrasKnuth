
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Logs {
    public static void main(String[] args) {
        String file = "assets/log.txt";
        System.out.println(IP(file));
    }

    private static List IP(String file) {
        try {

            Path logFilePath = Paths.get(file);
            List<String> content = Files.readAllLines(logFilePath);
            List<String> IPAddresses = new ArrayList<>();
            List<String> uniqueIPAddresses = new ArrayList<>();

            for (String line : content) {
                IPAddresses.add(line.substring(27, 37));
            }
            for (String line : IPAddresses) {
                if (uniqueIPAddresses.contains(IPAddresses)) {
                } else {
                    uniqueIPAddresses.add(line);
                }
            }
            return uniqueIPAddresses;

        } catch (IOException e) {
            List<String> failedList = new ArrayList<>();
            failedList.add("Failed to return IP addresses.");
            return failedList;
        }
    }
}

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP addresses.
// Write a function that returns the GET / POST request ratio.