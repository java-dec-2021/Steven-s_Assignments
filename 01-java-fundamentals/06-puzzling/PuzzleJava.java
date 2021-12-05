import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {

    public static void getTenRolls() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        Random randMachine = new Random();
        for (int i = 1; i <= 10; i++) {
            y.add(randMachine.nextInt(21));
        }
        System.out.println(y);
    }

    public static String getRandomLetter() {
        Random randMachine = new Random();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String[] y = new String[26];
        for (int i = 0; i < 26; i++) {
            y[i] = String.valueOf(letters.charAt(i));
        }
        return y[randMachine.nextInt(26)];
    }

    public static String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public static void getNewPasswordSet(int x) {
        ArrayList<String> y = new ArrayList<String>();
        for (int i = 0; i < x; i++) {
            y.add(generatePassword());
        }
        System.out.print(y);
    }

}
