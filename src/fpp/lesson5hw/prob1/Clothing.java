package fpp.lesson5hw.prob1;

public class Clothing extends Product{
    String brand;
    double discountValue;

    public Clothing(String productName, double price, String brand, double discountValue) {
        super(productName, price);
        this.brand = brand;
        this.discountValue = discountValue;
    }

    @Override
    public  double getPrice() {
        return this.price - (discountValue / 100 * this.price);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "brand='" + brand + '\'' +
                ", discountValue=" + discountValue +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
