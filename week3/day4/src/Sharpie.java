public class Sharpie {

    String color;
    float width;
    float inkAmount = 100;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;

    }
    public void use() {
        this.inkAmount--;
    }

    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("Pink", 50f);
        System.out.println(sharpie.inkAmount);
        for (int i = 0; i < 99; i++) {
            sharpie.use();
        }
        System.out.println(sharpie.inkAmount);
    }
}
/*Create Sharpie class
We should know about each sharpie their color (which should be a string),
width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount*/
