package foodtruckmenusystem;

/**
 *
 * @author Sai
 */
public class Ingredient implements Comparable<Ingredient> {
    private String name;
    private double price;

    // constructor to initialize ingredient
    public Ingredient(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // get name
    public String getName() {
        return name;
    }

    // get price
    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Ingredient other) {
        return this.name.compareToIgnoreCase(other.name); // Compare ingredients by name
    }

    @Override
    public String toString() {
        return name + " - $" + String.format("%.2f", price); // Format for display
    }
}
