import java.util.Scanner;
public class TaskH {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = b/a;

        if (a == 0 && b == 0) {
            System.out.println("INF");
        } else if (a == 0) {
            System.out.println("NO");
        } else if (b % a != 0) {
            System.out.println("NO");
        } else if (a*(-c)+b == 0) {
            System.out.println(-c);
        }
    }
}
