import java.util.Scanner;
public class TaskG {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int k = in.nextInt();

        if (k % 4 == 0) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
