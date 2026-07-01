import java.util.Scanner;


public class Main {
    public static void main(String[] args){
            ///Creates a new scanner to ask for the name.
        Scanner input = new Scanner.(System.in);
            ///Sends console log to prompt user for their name.
        System.out.print("What's you name: ");
            ///Collects the users name
        String name = input.nextLine();
            ///Prints the users name to the console.
        System.out.printf("Thank you, %s!", name);
            ///Closes the scanner.
        input.close();

    }



}