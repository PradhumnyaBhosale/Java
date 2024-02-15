import java.util.Scanner;
    public class area {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Radius");
            double r = scan.nextDouble();
            double area =3.14159*r*r;
            System.out.printf("Area Is %f (metre.square)",area);

        }

    }


