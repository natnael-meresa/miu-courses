package fpp.lesson5hw.prob1;

public class TestProduct {
    void main(){
        Product[] products = {
          new Clothing("shoes", 33.3, "best", 5),
          new Electronics("tablet", 344, 34, 30),
                new Furniture("chair", 4, 4, MaterialType.PLASTIC),
                new Clothing("pants", 34, "best", 4),
                new Electronics("tv", 455, 5, 30),
                null,
        };

        for (Product product: products) {
            System.out.println(product);
        }

        System.out.println("\nSum of all product:  " + sumProducts(products));

    }

    public static double sumProducts(Product[] col) {
        double total = 0.0;
        if (col == null ) {
            return total;
        }

        for (Product product: col) {
            if (product != null){
                total += product.getPrice();
            }
        }

        return  total;
    }
}
