public class EvilMindedOrb {
    private static EvilMindedOrbFactory evilMindedOrbUC = new EvilMindedOrbFactory(0);
    private static EvilMindedOrbFactory evilMindedOrbR = new EvilMindedOrbFactory(0);
    private static EvilMindedOrbFactory evilMindedOrbE = new EvilMindedOrbFactory(0);
    private static EvilMindedOrbFactory evilMindedOrbL = new EvilMindedOrbFactory(0);

    public EvilMindedOrb() {
        evilMindedOrbUC.setRarity(Rarity.uncommon);
        evilMindedOrbR.setRarity(Rarity.rare);
        evilMindedOrbE.setRarity(Rarity.epic);
        evilMindedOrbL.setRarity(Rarity.legendary);
    }
}
