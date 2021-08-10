import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n != 1) {
            System.out.print(n + " ");

            // suppose if n is odd
            if ((n & 1) == 1)
                n = 3 * n + 1;

                // suppose if even
            else
                n = n / 2;
        }

        // Print 1 at the end
        System.out.print(n);
    }
}
