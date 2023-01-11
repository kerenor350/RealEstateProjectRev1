import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" 1. createAccount\n" +
                "         2. signInIntoExistingAccount\n" +
                "         3. endProgram");
        int choice = scanner.nextInt();
        int choice2;
        while (choice ==1 || choice == 2 || choice ==3){
            if( choice ==1 ){
                RealEstate.createUser();
            }
            if (choice == 2) {

            }

        }

    }

}