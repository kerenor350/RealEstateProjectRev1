import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User[] users = {};
        City[] cities = {};
        Property[] properties = {};
        RealEstate realEstate = new RealEstate(users,cities);

        System.out.println(" 1. createAccount\n" +
                "         2. signInIntoExistingAccount\n" +
                "         3. endProgram");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //realEstate.checkPhoneNumber("0545921863");
                System.out.println("You enter number 1");
                break;
            case 2:
                System.out.println("You enter number 2");
                break;
            default:
                System.out.println("You enter default");
                break;


        }

    }
}