public class Main {
    private static Object calculateWhatYear;

    public static void main(String[] args) {
        calculateWhatYear (2024);
    }

    public static void calculateWhatYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }
     }
}
