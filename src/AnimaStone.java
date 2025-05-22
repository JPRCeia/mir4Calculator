public class AnimaStone {
    private static AnimaStoneFactory animaStoneUC = new AnimaStoneFactory(0);
    private static AnimaStoneFactory animaStoneR = new AnimaStoneFactory(0);
    private static AnimaStoneFactory animaStoneE = new AnimaStoneFactory(0);
    private static AnimaStoneFactory animaStoneL = new AnimaStoneFactory(0);

    public AnimaStone() {
        animaStoneUC.setRarity(Rarity.uncommon);
        animaStoneR.setRarity(Rarity.rare);
        animaStoneE.setRarity(Rarity.epic);
        animaStoneL.setRarity(Rarity.legendary);
    }
}
