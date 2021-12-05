public class TestBasicJava {
    public static void main(String[] args) {
        BasicJava tester = new BasicJava();
        tester.oneTo255();
        tester.oddTo255();
        System.out.println(tester.sumTo255());
        int[] arr = { 1, 3, 5, 7, 9, 13 };
        int[] arr2 = { -3, -5, -7 };
        tester.iterateArray(arr);
        tester.findMax(arr2);
        tester.arrayWithOdds();
        int[] arr3 = { 52, 13, 97, 4 };
        tester.getAverage(arr3);
        int[] arr4 = { 1, 3, 5, 7 };
        tester.greaterThan(arr4, 3);
        int[] arr5 = { 1, 5, 10, -2 };
        tester.squareTheValues(arr5);
        int[] arr6 = { 1, 5, 10, -2 };
        tester.eliminateNegativeNumbers(arr6);
    }
}
