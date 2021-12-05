import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static void oneTo255() {
        int i = 1;
        while (i <= 255) {
            System.out.println(i);
            i++;
        }
    }

    public static void oddTo255() {
        for (int i = 1; i <= 255; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static String sumTo255() {
        int sum = 0;
        for (int i = 1; i <= 255; i++) {
            sum = sum + i;
        }
        return String.valueOf(sum);
    }

    public static void iterateArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public static void findMax(int[] x) {
        int max = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        System.out.println(max);
    }

    public static void arrayWithOdds() {
        ArrayList<Object> y = new ArrayList<Object>();
        for (int i = 1; i <= 255; i += 2) {
            y.add(i);
        }
        System.out.print(y);
    }

    public static void getAverage(int[] x) {
        int sum = 0;
        int average = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        average = sum / x.length;
        System.out.println(average);
    }

    public static void greaterThan(int[] x, int y) {
        int length = 0;
        for (int i = 0; i <= x.length - 1; i++) {
            if (x[i] > y) {
                length = length + 1;
            }
        }
        System.out.println(length);
    }

    public static void squareTheValues(int[] x) {
        for (int i = 0; i <= x.length - 1; i++) {
            x[i] = x[i] * x[i];
        }
        System.out.println(Arrays.toString(x));
    }

    public static void eliminateNegativeNumbers(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                x[i] = 0;
            }
        }
        System.out.println(Arrays.toString(x));
    }
}
