package Jenny;

public class Invoice {
    String number;
    String description;
    int quantity;
    double pricePerItem;
    double tip;

    public Invoice(String number, String description, int quantity, double pricePerItem, double tip) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        this.tip = tip;
    }

    public double getTotal() {
        if (quantity < 0){
        return 0;
        }
        return quantity * pricePerItem + tip;

    }

}

