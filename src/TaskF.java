import java.util.Scanner;
public class TaskF {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m= in.nextInt();
        int n= in.nextInt();
        int k= in.nextInt();

        if(k%m==0||k%n==0){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
 