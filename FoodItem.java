package foodtruckmenusystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sai
 */
public class FoodItem implements Comparable<FoodItem> {
    private String name;
    private double basePrice;
    private List<Ingredient> ingredients;

    /**
    *Constructor
    */
    public FoodItem(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.ingredients = new ArrayList<>();
    }
    // Gets name of food
    public String getName() {
        return name;
    }
    // Gets price of food before any possible customization
    public double getBasePrice() {
        return basePrice;
    }
    // show all ingredients
    public List<Ingredient> getIngredients() {
        return ingredients;
    }
    // add an ingredient
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    // remove an ingredient
    public void removeIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    @Override
    public int compareTo(FoodItem other) {
        return this.name.compareToIgnoreCase(other.name); // Compare food items by name
    }
    
    // use string builder to ingredients and price
    @Override
    public String toString() {
        StringBuilder details = new StringBuilder(name + " - $" + String.format("%.2f", basePrice) + "\n");
        for (Ingredient ingredient : ingredients) {
            details.append("   ").append(ingredient.toString()).append("\n");
        }
        return details.toString();
    }
}