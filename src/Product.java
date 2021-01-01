public class Product {
    private String Name;
    private String sourceId;
    private int price;

    public Product(String name, String sourceId, int price) {
        Name = name;
        this.sourceId = sourceId;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", sourceId=" + sourceId +
                ", expiryDate=" + price +
                '}';
    }
}
