import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println("N should not be zero");
            return;
        }

        double harmonic = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonic += (double) 1 / i;
        }

        System.out.println("Nth Harmonic Value = " + harmonic);
    }
}