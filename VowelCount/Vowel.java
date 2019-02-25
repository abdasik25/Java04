package VowelCount;

public class Vowel {
    public static int VowelCountNotAllowed(String string) {
        return string.replaceAll("[^аАоОэЭиИуУыЫеЕёЁюЮяЯ]", "").length();
    }
}
