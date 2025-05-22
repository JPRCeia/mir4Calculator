public class Steel extends CraftMaterialEquipment {
    private static final Steel steelInstance = new Steel(0);

    public Steel(int quantity) {
        super(quantity);
    }

    public static Steel getSteelInstance() {
        return steelInstance;
    }
}
