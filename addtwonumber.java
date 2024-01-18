import java.util.Scanner;
public class addtwonumber 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = key.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = key.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);    
    }
}
