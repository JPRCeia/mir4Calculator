public class Steel {
    private static SteelFactory steelUC = new SteelFactory(0);
    private static SteelFactory steelR = new SteelFactory(0);
    private static SteelFactory steelE = new SteelFactory(0);
    private static SteelFactory steelL = new SteelFactory(0);

    public Steel() {
        steelUC.setRarity(Rarity.uncommon);
        steelR.setRarity(Rarity.rare);
        steelE.setRarity(Rarity.epic);
        steelL.setRarity(Rarity.legendary);
    }
}
