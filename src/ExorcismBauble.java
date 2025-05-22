public class ExorcismBauble extends CraftMaterialEquipment {
    private static final ExorcismBauble exorcismBaubleInstance = new ExorcismBauble(0);

    public ExorcismBauble(int quantity) {
        super(quantity);
    }

    public static ExorcismBauble getExorcismBaubleInstance() {
        return exorcismBaubleInstance;
    }
}