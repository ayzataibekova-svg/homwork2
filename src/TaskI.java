import java.util.Scanner;
public class TaskI {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int x=-b/a;

        if (c == 0 && d == 0) {
            System.out.println("INF");
        } else if (b % a != 0) {
            System.out.println("NO");
        }
        if (c * x + d != 0) {
            System.out.println(x);
        } else {
            System.out.println("NO");
        }
    }
}
