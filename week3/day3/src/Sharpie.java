public class Sharpie {
    String color;
    Float width;
    Float inkAmount = 100f;
    public Float Sharpie (String color, Float width){
        inkAmount--;
        return inkAmount;
    }
}
/*Create Sharpie class
We should know about each sharpie their color (which should be a string),
width (which will be a floating point number), inkAmount (another floating point number)
When creating one, we need to specify the color and the width
Every sharpie is created with a default 100 as inkAmount
We can use() the sharpie objects
which decreases inkAmount*/