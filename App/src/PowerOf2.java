import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int N = sc.nextInt();

        if (N < 0 || N >= 31) {
            System.out.println("Enter value between 0 and 30");
            return;
        }

        for (int i = 0; i <= N; i++) {
            System.out.println("2^" + i + " = " + (1 << i));
        }
    }
}