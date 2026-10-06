import java.util.Scanner;
public class TaskO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();

        if (a<b) {
            System.out.println("2");
        }
        if (a>b) {
            System.out.println("1");
        }
        if (a==b) {
            System.out.println("0");
        }
    }
}