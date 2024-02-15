
import java.util.Scanner;
public class compare {

    public static void main(String[] args) {
        int big;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First");
        int r = scan.nextInt();
        System.out.println("Enter Second");
        int p=scan.nextInt();
        System.out.println("Enter Third");
        int q=scan.nextInt();
        if (p>q && p>r) {
            big=p;
        }
        else if(q>p && q>r){
            big=q;
        }
        else{
            big=r;
        }

        System.out.print(big);

        int a=5,b=10,c=17;
        boolean flag=(a>b);
        System.out.println(" ");
        System.out.println(flag);
        boolean flag2=(b<c);
        System.out.println(flag2);


    }

}
