import java.util.Scanner;
public class TaskL {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int sides = 2 * n;
        int batches = (sides + k - 1)/ k;
        int time = batches * m;

        System.out.println(time);
    }
}

