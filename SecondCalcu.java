import java.util.Scanner;

public class SecondCalcu{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Menu: \n[1] Addition \n[2] Subtraction \n[3] Multiplication");
        System.out.print("Choose an option: ");
        int option = scan.nextInt();

        switch (option) {
            case 1: 
                System.out.println("Addition");
                System.out.print("Enter first number: ");
                double add1 = scan.nextDouble();

                System.out.print("Enter second number: ");
                double add2 = scan.nextDouble();

                System.out.println(addition(add1, add2));

                break;
        }
    }

    public static double addition (double a, double b) {
        return a + b;
    }
}