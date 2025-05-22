public class Quintessence extends CraftMaterialEquipment {
    private static final Quintessence quintessenceInstance = new Quintessence(0);

    public Quintessence(int quantity) {
        super(quantity);
    }

    public static Quintessence getQuintessenceInstance() {
        return quintessenceInstance;
    }
}