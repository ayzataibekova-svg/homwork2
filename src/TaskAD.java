import java.util.Scanner;
public class TaskAD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int z = in.nextInt();

        if ((x == 1 && z == 1) || (x != 1 && z != 1)) {
            System.out.println("yes");
        }  else {
            System.out.println("no");
        }
    }
}