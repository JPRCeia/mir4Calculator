public abstract class CraftMaterialEquipment {
    private int quantity;
    private Rarity rarity;
    private Copper copper;
    private DarkSteel darkSteel;
    private Powder powder;
    private int quantityNeeded = 10;
    private int copperNeeded;
    private int darkSteelNeeded;
    private int powderNeeded;

    public CraftMaterialEquipment(int quantity) {
        this.quantity = quantity;
        copper = Copper.getInstance();
        darkSteel = DarkSteel.getInstance();
        powder = Powder.getInstance();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public int getCopperNeeded() {
        return copperNeeded;
    }

    public int getDarkSteelNeeded() {
        return darkSteelNeeded;
    }

    public int getPowderNeeded() {
        return powderNeeded;
    }
}
