package functions;

import java.util.Random;
import java.util.Scanner;

public class Functoins {
    Scanner console = new Scanner(System.in);
    public String scramble;

    public String input() {
        System.out.println("Geef een woord:");
        return console.nextLine();
    }

    public void generateCode(String word) {
        this.scramble = generateSecretCode(word);
    }

    private String generateSecretCode(String word) {
        char[] chars = word.toCharArray();
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {
            int randomIndex = random.nextInt(chars.length);
            char index = chars[i];// Bewaart het karakter op de huidige index in een tijdelijke variabele
            chars[i] = chars[randomIndex];// Wissel het karakter op de huidige index met het karakter op de willekeurige index
            chars[randomIndex] = index;
        }
        return new String(chars);//zet weer om naar string 
    }
}
