public class Copper {
    public int quantity;
    private static final Copper copperInstance = new Copper();

    private Copper() {
        this.quantity = 0;
    }

    public static Copper getInstance() {
        return copperInstance;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
