package fpp.lesson3hw.prog4;

public class Pizza {
    private PizzaSize size;
    private  PizzaType type;
    private  int qty;
    private double price;

    Pizza(PizzaSize size, PizzaType type, int qty) {
        this.size = size;
        this.type = type;
        this.qty = qty;
    }

    private void calculatePrice() {
        double sizePrice = switch (this.size) {
            case SMALL -> 8.00;
            case MEDIUM -> 10.00;
            case LARGE -> 12.00;
        };

        double typePrice = switch (this.type) {
            case CHEEZE -> 1.50;
            case VEGGIE -> 1.00;
            case PEPPERONI, BBQ_CHICKEN -> 2.00;
        };


        this.price = (sizePrice + typePrice) * 2;
    }

    public String printOrderSummary() {
        this.calculatePrice();
        return String.format("Pizza Order: \nSize: %s \nType: %s \nQty: %d \nPrice: $ %.2f \nTax: %.2f \nTotalPrice: %.2f \n\n\n",
                this.size, this.type, this.qty, this.price, this.price * 0.03, this.price + (this.price * 0.03));
    }


}
