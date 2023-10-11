package GroceryProductStore;

public class Customer {
    private final String name;
    private final MemberShipStatus memberShipStatus;
    private final DiscountCalculator discountCalculator;

    public Customer(String name, MemberShipStatus memberShipStatus) {
        this.name = name;
        this.memberShipStatus = memberShipStatus;

        switch (memberShipStatus) {
            case REGULAR -> discountCalculator = new RegularMemberDiscountCalculator();
            case PREMIUM -> discountCalculator = new PremiumMemberDiscountCalculator();
            default -> discountCalculator = new NonMemberDiscountCalculator();
        }

    }

    public DiscountCalculator getDiscountCalculator() {
        return discountCalculator;
    }
}
