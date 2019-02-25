package DragonHeads;

public class Main {
    public static void main(String[] args) {
        int dragonAge = 3500;
        int dragonHeads = Dragon.countAmountOfHeads(dragonAge);
        System.out.println("Dragon, who is " + dragonAge + " years old has " +
                dragonHeads + " heads with " + dragonHeads * 2 + " eyes.");
    }
}
