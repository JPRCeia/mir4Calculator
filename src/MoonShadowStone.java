public class MoonShadowStone {
    private static MoonShadowStoneFactory moonShadowStoneUC = new MoonShadowStoneFactory(0);
    private static MoonShadowStoneFactory moonShadowStoneR = new MoonShadowStoneFactory(0);
    private static MoonShadowStoneFactory moonShadowStoneE = new MoonShadowStoneFactory(0);
    private static MoonShadowStoneFactory moonShadowStoneL = new MoonShadowStoneFactory(0);

    public MoonShadowStone() {
        moonShadowStoneUC.setRarity(Rarity.uncommon);
        moonShadowStoneR.setRarity(Rarity.rare);
        moonShadowStoneE.setRarity(Rarity.epic);
        moonShadowStoneL.setRarity(Rarity.legendary);
    }
}
