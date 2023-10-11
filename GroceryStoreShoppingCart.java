package GroceryProductStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStoreShoppingCart {
    private final List<GroceryProduct> products = new ArrayList<>();
    private final Customer customer;

    public GroceryStoreShoppingCart(Customer customer) {
        this.customer = customer;
    }

    public void addProduct(GroceryProduct product) {
        products.add(product);
    }

    public double checkout() {
        double totalPrice = 0.0;
        for (GroceryProduct product : products) {
            var discount = customer.getDiscountCalculator().calculateDiscount(product);
            totalPrice += (product.getPrice() - discount);
        }
        return totalPrice;
    }
}
