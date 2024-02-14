import java.lang.*;
public  class Main{
    public static void main(String[] args) {
        System.out.println("Hello World");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j>=(4-i))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
