package GroceryProductStore;

public class GroceryProductStore {
    public static void main(String[] args) {
        var banana = new Fruit("Banana", .5);
        var carrot = new Fruit("Carrot", .25);
        var steak = new Fruit("Steak", 5.00);

        var customer = new Customer("Alamin", MemberShipStatus.PREMIUM);

        GroceryStoreShoppingCart cart = new GroceryStoreShoppingCart(customer);
        cart.addProduct(banana);
        cart.addProduct(carrot);
        cart.addProduct(steak);

        var count = cart.checkout();
        System.out.println("Amount = " + count);
    }
}
