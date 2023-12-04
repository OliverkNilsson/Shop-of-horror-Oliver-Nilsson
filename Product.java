public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    int quanLeft(int quanLeft) {

        if( quantity >= 1 ) {
            quantity -= quanLeft;
        }


        return quanLeft;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

}
