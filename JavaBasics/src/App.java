import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String name;
        int age;
        int birthYear;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Enter your birthday: ");
        birthYear = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old and were born in " + birthYear + ".");

        if (age >= 18){
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
    }
}
