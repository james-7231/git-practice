import java.util.Scanner;


public class Main {
    public static void main(String[] args){
            ///Creates a new scanner to ask for the name.
        Scanner input = new Scanner(System.in);
            ///Sends console log to prompt user for their name.
        System.out.print("What's your name: ");
            ///Collects the users name
        String name = input.nextLine();
            ///Prints the users name to the console.
        System.out.printf("Welcome to GitHub, %s!", name);
            ///Closes the scanner.
        System.out.println();
        System.out.print("How old are you?: ");

        int age = input.nextInt();
        System.out.println();
        System.out.printf("%s, you're %d years old!", name, age);
        System.out.print("Would you like to make an account (y/n) : ");
        System.out.println();
        input.close();


    }



}