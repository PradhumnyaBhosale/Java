import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
       int a,b,c;
       Scanner scan =new Scanner(System.in);
        System.out.println("enter Forst");
        a = scan.nextInt();
        System.out.println("Enter Second");
        b  = scan.nextInt();
        c = a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}
