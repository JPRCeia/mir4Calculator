public class IlluminatingFragment extends CraftMaterialEquipment {
    private static final IlluminatingFragment illuminatingFragmentInstance = new IlluminatingFragment(0);

    public IlluminatingFragment(int quantity) {
        super(quantity);
    }

    public static IlluminatingFragment getIlluminatingFragmentInstance() {
        return illuminatingFragmentInstance;
    }
}