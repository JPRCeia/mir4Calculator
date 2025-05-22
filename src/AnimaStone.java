public class AnimaStone extends CraftMaterialEquipment {
    private static final AnimaStone animaStoneInstance = new AnimaStone(0);

    public AnimaStone(int quantity) {
        super(quantity);
    }

    public static AnimaStone getAnimaStoneInstance() {
        return animaStoneInstance;
    }
}