import java.util.Scanner;
public class TaskW {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sixty = n / 60;
        n = n % 60;
        int ten = n / 10;
        n = n % 10;
        int one = n;
        if (n > 5) {
            ten++;
            one = 0;
        }
        System.out.println(one + " " + ten + " " + sixty);
    }
}