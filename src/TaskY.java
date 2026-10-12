import java.util.Scanner;
public class TaskY {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        if (y > 1) {
            System.out.println(x + " " + (y - 1));
        }
        if (x > 1) {
            System.out.println((x - 1) + " " + y);
        }
        if (y < n) {
            System.out.println(x + " " + (y + 1));
        }
        if (x < m) {
            System.out.println((x + 1) + " " + y);
        }
    }
}