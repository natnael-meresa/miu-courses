package fpp.lesson5hw.prob1;

public class Furniture extends  Product{
    double shippingCost;
    MaterialType materialType;

    public Furniture(String productName, double price, double shippingCost, MaterialType materialType) {
        super(productName, price);
        this.shippingCost = shippingCost;
        this.materialType = materialType;
    }

    @Override
    public  double getPrice() {
        return shippingCost + price;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "shippingCost=" + shippingCost +
                ", materialType=" + materialType +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
