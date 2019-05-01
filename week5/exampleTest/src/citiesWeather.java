import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;

public class citiesWeather {
    public static void main(String[] args) {
        try {
            Path filePath = Paths.get("src/cities.txt");
            List<String> citiesWeather = Files.readAllLines(filePath);
            HashMap <String,String> weather = new HashMap<>();
            for (String cities : citiesWeather){
                System.out.println(citiesWeather.subList(',',','));

            }


        } catch (Exception e) {
            System.out.println("Uh-oh, could not read the file!");
        }
    }
}
/*
Write a method which can read and parse a file containing information about weather in various cities.
The method must return the name of the city which had the most rainy days.
 */
