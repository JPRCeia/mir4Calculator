public class Platinum {
    private static PlatinumFactory platinumUC = new PlatinumFactory(0);
    private static PlatinumFactory platinumR = new PlatinumFactory(0);
    private static PlatinumFactory platinumE = new PlatinumFactory(0);
    private static PlatinumFactory platinumL = new PlatinumFactory(0);

    public Platinum() {
        platinumUC.setRarity(Rarity.uncommon);
        platinumR.setRarity(Rarity.rare);
        platinumE.setRarity(Rarity.epic);
        platinumL.setRarity(Rarity.legendary);
    }
}
