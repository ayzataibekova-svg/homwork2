import java.util.Scanner;
public class TaskD {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int d= in.nextInt();

        if(Math.abs(a-c)==Math.abs(b-d)||a==c||b==d){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
