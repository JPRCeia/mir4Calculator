public class ExorcismBauble {
    private static ExorcismBaubleFactory exorcismBaubleUC = new ExorcismBaubleFactory(0);
    private static ExorcismBaubleFactory exorcismBaubleR = new ExorcismBaubleFactory(0);
    private static ExorcismBaubleFactory exorcismBaubleE = new ExorcismBaubleFactory(0);
    private static ExorcismBaubleFactory exorcismBaubleL = new ExorcismBaubleFactory(0);

    public ExorcismBauble() {
        exorcismBaubleUC.setRarity(Rarity.uncommon);
        exorcismBaubleR.setRarity(Rarity.rare);
        exorcismBaubleE.setRarity(Rarity.epic);
        exorcismBaubleL.setRarity(Rarity.legendary);
    }
}
