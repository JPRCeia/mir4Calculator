public class EvilMindedOrb extends CraftMaterialEquipment {
    private static final EvilMindedOrb evilMindedOrbInstance = new EvilMindedOrb(0);

    public EvilMindedOrb(int quantity) {
        super(quantity);
    }

    public static EvilMindedOrb getEvilMindedOrbInstance() {
        return evilMindedOrbInstance;
    }
}