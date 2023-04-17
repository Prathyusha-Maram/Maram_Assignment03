package question09;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            System.out.println("Hello, " + name + "! You are " + age + " years old.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}

}
