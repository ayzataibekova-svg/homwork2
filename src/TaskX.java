import java.util.Scanner;
public class TaskX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sixty = n / 60;
        n = n % 60;
        int twenty = n / 20;
        n = n % 20;
        int ten = n / 10;
        n = n % 10;
        int five = n / 5;
        n = n % 5;
        int one = n;
        if (one > 0 && one * 15 > 70) {
            five++;
            one = 0;
        }
        if (five * 70 + one * 15 > 125 && five > 0) {
            ten++;
            five = 0;
            one = 0;
        }
        if (ten * 125 + five * 70 + one * 15 > 230 && ten > 0) {
            twenty++;
            ten = 0;
            five = 0;
            one = 0;
        }
        System.out.println(one + " " + five + " " + ten + " "
                + twenty + " " + sixty);
    }
}