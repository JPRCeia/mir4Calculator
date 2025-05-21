public class Powder {
    public int quantity;
    private static final Powder powderInstance = new Powder();

    private Powder() {
        this.quantity = 0;
    }

    public static Powder getInstance() {
        return powderInstance;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
