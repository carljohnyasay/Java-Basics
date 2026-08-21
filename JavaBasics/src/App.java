import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* String name;
        int age;
        int birthYear; */

        Scanner scanner = new Scanner(System.in);

        /* System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Enter your birthyear: ");
        birthYear = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old and were born in " + birthYear + ".");

        if (age >= 18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        } */

/*         int number1;
        int number2;

        System.out.println("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        number2 = scanner.nextInt();

        int sum = number1 + number2;

        System.out.print("The sum of " + number1 + " and " + number2 + " is " + sum + "."); */



/*         System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("The number " + number + " is even.");

        } else {
            System.out.println("The number " + number + " is odd.");
        }
 */

       
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter the last number: ");
        int number3 = scanner.nextInt();

        int largestNumber;

        if (number1 >= number2 && number1 >= number3){
            largestNumber = number1;
        } else if (number2 >= number1 && number2 >= number3){
            largestNumber = number2;
        } else {
            largestNumber = number3;
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}
