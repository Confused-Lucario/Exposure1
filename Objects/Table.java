package Objects;

/*
 * Since this is European furniture, it is measured in cm and kg
 *
 */

public class Table {

    // Attributes - (variables)
    double height;
    double width;
    double weight;
    double price;
    double length;
    double weightRating;
    double topThickness;
    int legs;
    String material;
    String color;
    boolean mobile;
    boolean foldable;

    // Default Constructor
    // name of the method is always the name of the class
    public Table() {
        height = 23;
        width = 40;
        weight = 52;
        price = 50;
        length = 40;
        weightRating = 120;
        topThickness = 5;
        legs = 4;
        material = "wood";
        color = "brown";
        mobile = false;
        foldable = false;
    }

    // Getters/Accessors
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public double getWeightRating() {
        return weightRating;
    }

    public double getTopThickness() {
        return topThickness;
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public boolean isMobile() {
        return mobile;
    }

    public boolean isFoldable() {
        return foldable;
    }
}
