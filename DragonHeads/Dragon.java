package DragonHeads;

public class Dragon {

    private static final int LOWER_BORDER = 200;
    private static final int UPPER_BORDER = 300;

    public static int countAmountOfHeads(int dragonAge) {
        if (dragonAge < 0) {
            return -1;
        }
        int heads = 3;
        if (dragonAge < 200) {
            heads += dragonAge * 3;
        } else if (dragonAge < 300) {
            heads += LOWER_BORDER * 3 + dragonAge * 2 - LOWER_BORDER * 2;
        } else {
            heads += LOWER_BORDER * 3 + UPPER_BORDER * 2 - UPPER_BORDER * 1 + dragonAge * 1;
        }
        return heads;
    }

}
