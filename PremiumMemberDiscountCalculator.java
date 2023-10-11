package GroceryProductStore;

public class PremiumMemberDiscountCalculator implements DiscountCalculator {

    @Override
    public double calculateDiscount(GroceryProduct product) {
        return product.getPrice() * 0.15;
    }
}
