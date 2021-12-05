public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava tester = new PuzzleJava();
        tester.getTenRolls();
        System.out.println(tester.getRandomLetter());
        System.out.println(tester.generatePassword());
        tester.getNewPasswordSet(3);
    }
}
