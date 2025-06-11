
class Restaurant {

    private String itemName;
    private int originalPrice;

    Restaurant(String itemName, int originalPrice) {
        this.itemName = itemName;
        this.originalPrice = originalPrice;

    }

    public void applyDiscount() {
        int discount = 20;
        int discountedPrice = originalPrice - discount;
        System.out.println("Applying 20% discount on " + itemName);
        System.out.println("Original Price: ₹" + originalPrice);
        System.out.println("Discounted Price: ₹" + discountedPrice);

    }

}

public class Anonymous {

    public static void main(String[] args) {
        new Restaurant("Pizza", 100).applyDiscount();

    }
}
