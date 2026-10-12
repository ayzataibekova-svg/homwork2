import java.util.Scanner;
public class TaskAB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x == 100) System.out.print("C");
        else if (x >= 90) System.out.print("XC");
        else if (x >= 50) {
            System.out.print("L");
            x -= 50;
        }
        else if (x >= 40) {
            System.out.print("XL");
            x -= 40;
        }
        if (x >= 10) {
            System.out.print("X");
            x -= 10;
        }
        if (x >= 9) {
            System.out.print("IX");
            x -= 9;
        }
        if (x >= 5) {
            System.out.print("V");
            x -= 5;
        }
        if (x >= 4) {
            System.out.print("IV");
            x -= 4;
        }
        if (x >= 1) {
            System.out.print("I");
        }
    }
}