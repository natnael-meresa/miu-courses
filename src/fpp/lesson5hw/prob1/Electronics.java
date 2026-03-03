package fpp.lesson5hw.prob1;

public class Electronics extends  Product{
    int warranty;
    double warrantyCost;

    public Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);
        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public  double getPrice() {
        return  warrantyCost + price;
    }

    @Override
    public String toString(){
        return "Electronics{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", warranty=" + warranty +
                ", warrantyCost=" + warrantyCost +
                '}';
    }
}
