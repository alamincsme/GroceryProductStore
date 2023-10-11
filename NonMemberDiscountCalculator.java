package GroceryProductStore;

public class NonMemberDiscountCalculator implements DiscountCalculator {

    @Override
    public double calculateDiscount(GroceryProduct product) {
        System.out.println("Non Member has no discount.");
        return 0.0;
    }
}
