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
        Invoice inv01 = new Invoice(
                "INVC-001",
                "this is the total for your 2nd order.",
                99,
                249.13,
                1.0);

        double invT = inv.getTotal();
        double invT2 = inv01.getTotal();
        double roundOffinvT = Math.round(invT * 100.0) / 100.0;
        double roundOffinvT2 = Math.rint(invT2 * 100.0) / 100.0;

        System.out.println(inv);

        if(inv.price < 0){
            inv.price = 0;
            System.out.println("your total is: € " + inv.price);
        } else {
            System.out.println("your total is: € " + roundOffinvT);
        }

        if(inv01.price < 0){
            inv01.price = 0;
            System.out.println("your total is: € " + inv01.price);
        } else {
            System.out.println("your total is: € " + roundOffinvT2);
        }
    }
}
