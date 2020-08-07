import java.util.Scanner;

public class SumOfTwoDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(addTwoDigits(a, b));
    }

    public static int addTwoDigits(int a, int b) {
        return a + b;
    }
}
