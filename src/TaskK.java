
import java.util.Scanner;
public class TaskK {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        if(a == 3 || a == 5 || a % 3 == 0 || (a - 5) % 3 == 0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}

