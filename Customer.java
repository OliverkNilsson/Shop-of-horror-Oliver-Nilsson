public class Customer {

    private int totalProducts;
    private double totPrice;

    public Customer(int totalProducts, double price) {

        this.totalProducts = totalProducts;
        this.totPrice = price;

    }

    double totalPrice(double totalPrice) {

        totPrice += totalPrice;

        totalProducts++;

        return totalPrice;
    }
    public int getTotalProducts() {
        return totalProducts;
    }
    public double getPrice() {
        return totPrice;
    }
}
