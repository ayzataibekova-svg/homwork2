
import java.util.Scanner;
public class TaskJ {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int pp=a*100+b;
        int oo=c*100+d;
        int ii=oo-pp;
        int e= ii/100;
        int f= ii%100;


        System.out.print(e +" "+ f);
        }
    }

