import java.util.Scanner;
public class TaskU {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > c) {
            int t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            int t = b;
            b = c;
            c = t;
        }
        if (a + b <= c) {
            System.out.println("impossible");
        }
        else if (a * a + b * b == c * c) {
            System.out.println("right");
        }
        else if (a * a + b * b > c * c) {
            System.out.println("acute");
        }
        else {
            System.out.println("obtuse");
        }
    }
}
