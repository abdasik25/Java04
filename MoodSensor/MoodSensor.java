package MoodSensor;

public class MoodSensor {
    public static void QualifyEmotions(int randomNumber){
        if (randomNumber < 1) {
            System.out.println("Why are you so sad? (ಥ﹏ಥ)");
        } else if (randomNumber < 6) {
            System.out.println("Just another day has passed... ༼ つ ◕_◕ ༽つ");
        } else {
            System.out.println("As happy as never before ¯\\_(ツ)_/¯ ");

        }
    }
}
