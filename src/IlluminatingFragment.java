public class IlluminatingFragment {
    private static IlluminatingFragmentFactory illuminatingFragmentUC = new IlluminatingFragmentFactory(0);
    private static IlluminatingFragmentFactory illuminatingFragmentR = new IlluminatingFragmentFactory(0);
    private static IlluminatingFragmentFactory illuminatingFragmentE = new IlluminatingFragmentFactory(0);
    private static IlluminatingFragmentFactory illuminatingFragmentL = new IlluminatingFragmentFactory(0);

    public IlluminatingFragment() {
        illuminatingFragmentUC.setRarity(Rarity.uncommon);
        illuminatingFragmentR.setRarity(Rarity.rare);
        illuminatingFragmentE.setRarity(Rarity.epic);
        illuminatingFragmentL.setRarity(Rarity.legendary);
    }
}
