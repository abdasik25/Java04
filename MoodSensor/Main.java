package MoodSensor;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (-2 + Math.random() * 12);
        MoodSensor.QualifyEmotions(randomNumber);
    }
}
