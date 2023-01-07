import java.sql.SQLOutput;
import java.util.Scanner;

public class RealEstate {
    Scanner scanner = new Scanner(System.in);
    private User [] users;
    private City[] cities;

    private Property[] properties;


    public RealEstate(User[] users, City[] cities) {
        this.users = users;
        this.cities = cities;
    }
    public boolean checkUser( String user) {
        boolean check = false;
        for (int i = 0; i < users.length; i++) {
            if ( users [i].isUserName(user)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static boolean strongPassword( String password) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a strong password");
        password = scanner.next();
        boolean foundAtLeastOne = false;
        boolean foundASign = false;
        if (password.length() > 7 && password.length() <= 10) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    foundAtLeastOne = true;
                }
                if (password.charAt(i) == '_' || password.charAt(i) == '%' || password.charAt(i) == '$') {
                    foundASign = true;
                }
            }
            if (foundAtLeastOne == true && foundASign == true) {
                return true;
            }
        }
        return false;
    }


    public  boolean checkPhoneNumber(String phoneNumber) {
        boolean checkPhone = true;
        if (phoneNumber.length() != 10) {
            checkPhone = false;
            System.out.println(" Your number is too short, enter 10 digits.");
        }
        if (phoneNumber.charAt(0) != 0 || phoneNumber.charAt(1) != 5) {
            checkPhone = false;
            System.out.println(" Your number does not start with: 05");
        }
        for (int j = 0; j < phoneNumber.length(); j++) {
            if (!Character.isDigit(phoneNumber.charAt(j))) {
                checkPhone = false;
                System.out.println(" Make sure to write only numbers");
            }
        }
        return checkPhone;
    }

    public void createUser (boolean checkPhoneNumber, boolean checkUser, boolean strongPassword) {
        String newUser,password,phoneNumber;
        boolean agentOrRegular;

        do{ newUser = scanner.nextLine();
        }while (checkUser(newUser));
        User [] temporaryUsers =new User[users.length+1];
        users = temporaryUsers;

        do {System.out.println("Enter your phone number");
            phoneNumber = scanner.nextLine();
        }while (checkPhoneNumber(phoneNumber));

        do {
            System.out.println("Enter your password");
            password = scanner.nextLine();
        } while (strongPassword(password));

        String answer;
        do{ System.out.println("Are you an agent? (Y/N) ");
            answer = scanner.nextLine();

        }while (answer == "Y" ||  answer == "N" || answer == "y" || answer == "n"  ) ;

            if (answer == "Y" || answer == "y "){

                agentOrRegular =true;
        }else {agentOrRegular =false;}
        users [users.length-1] = new User ( newUser, password, phoneNumber, agentOrRegular);
            
    }

}
