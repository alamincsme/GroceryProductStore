package GroceryProductStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryProduct {
    private final String name;
    private final double price;

    public GroceryProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


