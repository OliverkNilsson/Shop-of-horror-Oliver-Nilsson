public class Discount extends Product {
    private double discount;
    Discount (String name, double price, int quantity, double discount) {
        super(name, price, quantity);
        this.discount = discount;
    }

    public double getDiscountPrice() {

        return getPrice() * 0.5;
    }

}
