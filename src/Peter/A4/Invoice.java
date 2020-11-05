package Peter.A4;

public class Invoice {

    // initialize
    public String number;
    public String description;
    public int quantity;
    public double price;
    public double tip;

    // constructor
    // edit constructor DOES NOT need a return-type.
    public Invoice(String number, String description, int quantity, double price, double tip){
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "number='" + number + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", tip=" + tip +
                '}';
    }

    //method to calculate Total sum
    public double getTotal(){
        return (quantity * price) * tip;
    }
}
