package Jenny;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("A3434","Kakao",5,10,2);
        Invoice invoice2 = new Invoice("A3435","Duvel",2,20,6);
        System.out.println(invoice1.getTotal());
    }

    }

