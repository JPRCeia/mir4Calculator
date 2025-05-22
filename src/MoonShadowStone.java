public class MoonShadowStone extends CraftMaterialEquipment {
    private static final MoonShadowStone moonShadowStoneInstance = new MoonShadowStone(0);

    public MoonShadowStone(int quantity) {
        super(quantity);
    }

    public static MoonShadowStone getMoonShadowStoneInstance() {
        return moonShadowStoneInstance;
    }
}