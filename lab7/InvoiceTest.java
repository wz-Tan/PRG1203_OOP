package lab7;

public class InvoiceTest {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("1234", "Hammer", 2, 14.95);
        Invoice invoice2 = new Invoice("5678", "Paint Brush", -5, -9.99);

        System.out.println(invoice1);
        System.out.println(invoice2);

        invoice1.setPartNumber("001234");
        invoice1.setPartDescription("Yellow Hammer");
        invoice1.setQuantity(3);
        invoice1.setPricePerItem(19.49);

        
        System.out.println(invoice1);
    }
}
