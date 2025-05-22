public class DarkSteel {
    public int quantity;
    private static DarkSteel darkSteelInstance = new DarkSteel();

    private DarkSteel() {
        this.quantity = 0;
    }

    public static DarkSteel getInstance() {
        return darkSteelInstance;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
