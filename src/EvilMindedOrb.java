public class Evil_Minded_Orb extends Craft_Material_Equipment {
    private static final Evil_Minded_Orb evilMindedOrbInstance = new Evil_Minded_Orb(0);

    public Evil_Minded_Orb(int quantity) {
        super(quantity);
    }

    public static Evil_Minded_Orb getEvilMindedOrbInstance() {
        return evilMindedOrbInstance;
    }
}