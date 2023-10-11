package GroceryProductStore;

public class RegularMemberDiscountCalculator implements DiscountCalculator {

    @Override
    public double calculateDiscount(GroceryProduct product) {
        return product.getPrice() * .1;
    }
}
