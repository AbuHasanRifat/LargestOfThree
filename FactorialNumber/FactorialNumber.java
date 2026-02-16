import java.util.Scanner;

public class FactorialNumber{
    public static void main(String[] args){

        Scanner imp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = imp.nextInt();

        int factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);
    }
}