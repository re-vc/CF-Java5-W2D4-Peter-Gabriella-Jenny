package Peter.A4;

import sun.nio.cs.ext.MacThai;

public class Main {
    public static void main(String[] args) {

        Invoice inv = new Invoice(
                "INVC-000",
                "this is the total for your order.",
                3,
                33.33,
                1.15);

        double invT = inv.getTotal();
        double roundOffinvT = Math.round(invT * 100.0) / 100.0;

        System.out.println(inv);

        if(inv.price < 0){
            inv.price = 0;
            System.out.println("your total is: " + inv.price);
        } else {
            System.out.println("your total is: " + roundOffinvT);
        }
    }
}
