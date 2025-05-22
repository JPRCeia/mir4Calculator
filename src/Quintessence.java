public class Quintessence {
    private static QuintessenceFactory quintessenceUC = new QuintessenceFactory(0);
    private static QuintessenceFactory quintessenceR = new QuintessenceFactory(0);
    private static QuintessenceFactory quintessenceE = new QuintessenceFactory(0);
    private static QuintessenceFactory quintessenceL = new QuintessenceFactory(0);

    public Quintessence() {
        quintessenceUC.setRarity(Rarity.uncommon);
        quintessenceR.setRarity(Rarity.rare);
        quintessenceE.setRarity(Rarity.epic);
        quintessenceL.setRarity(Rarity.legendary);
    }
}
