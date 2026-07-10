package lab7;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice() {}

    public Invoice(
        String partNumber,
        String partDescription,
        int quantity,
        double pricePerItem
    ) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        // Safeguards
        this.quantity = quantity < 0 ? 0 : quantity;
        this.pricePerItem = pricePerItem < 0 ? 0 : pricePerItem;
    }

    // getters
    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // setters
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    //  Custom function
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return String.format(
            "Invoice has the part number %s, description %s, quantity %d, price %.2f",
            partNumber,
            partDescription,
            quantity,
            pricePerItem
        );
    }
}
