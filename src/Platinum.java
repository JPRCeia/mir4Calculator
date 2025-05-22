public class Platinum extends CraftMaterialEquipment {
    private static final Platinum platinumInstance = new Platinum(0);

    public Platinum(int quantity) {
        super(quantity);
    }

    public static Platinum getPlatinumInstance() {
        return platinumInstance;
    }
}