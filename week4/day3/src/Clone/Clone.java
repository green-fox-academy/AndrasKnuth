package Clone;

public class Clone{
    public static void main(String[] args) {
        Student john = new Student("John", 20, "male", "BME");
        Student johnTheClown = john.clone();

        johnTheClown.introduce();
    }
}
