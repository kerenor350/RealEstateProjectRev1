import java.sql.SQLOutput;
import java.util.Scanner;

public class RealEstate {
    Scanner scanner = new Scanner(System.in);
    private User[] users;


    private Property[] properties;
    private City city1= new City("Tel Aviv", "Center" , new String []{"Ben Yehudah", "Dizingof","Even Gavirol"});
    private City city2 = new City ( "Beer Sheva", "Negev", new String[]{ "Itzhak Shamir", "David Hamelech", " Jaffo"});
    private City city3 = new City ("Eilat", "South", new String []{"Hatamar", "Hashaked", "HaElla"});
    private City city4 = new City (" Ramat HaSharon", "Hasharon", new String [] { "Elimelech", "Oz", " Yavniel"});
    private City city5 = new City ( " Carmiel", "North", new String [] { " Ben Yehuda", " Ezra", " David"});
    private City city6 = new City ( " Ashkelon", " South", new String [] { " Havered", " Shvat", " Adar"});
    private City city7 = new City ( " Haifa", "North",new String [] {" Brosh", "Sivan", "Tevet"});
    private City city8 = new City ( " Tberias", "North", new String [] { " Rabin", "Ben Gurion", " Ehad Ha'am"});
    private City city9 = new City ( " Jerusalem", " Center", new String[] {"Eben Ezra", "Yehuda HaNasi", "Ariel Sharon"});
    private City city10 = new City ( " Hod Hasharon" , " Hasharon" , new String[] {" Egoz", "Admonit", " Avshalom"});

    City [] cities = new City []   { city1, city2,city3,city4, city5, city6, city7, city8, city9, city10};

    public RealEstate(City[] cityNames) {
        this.cityNames = cityNames;

    }

    public RealEstate(User[] users, City[] cities) {
        this.users = users;
        this.cities = cities;
    }


    public boolean checkUser(String user ) {
        boolean check = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].isUserName(user)) {
                check = true;
                break;
            }
        }
        return check;
    }



    public static boolean strongPassword(String password) {
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


    public boolean checkPhoneNumber(String phoneNumber) {
        boolean checkPhone = true;
        if (phoneNumber.length() != 10) {
            checkPhone = false;
            System.out.println(" Your number is too short, enter 10 digits.");
        }
        if (phoneNumber.charAt(0) != '0' && phoneNumber.charAt(1) != '5') {
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

    public static void createUser() {
        String newUser, password, phoneNumber;
        boolean agentOrRegular;

        do {
            newUser = scanner.nextLine();
        } while (checkUser(newUser));
        User[] temporaryUsers = new User[users.length + 1];
        for(int i = 0; i< users.length; i++){
            temporaryUsers[i] = users[i];
        }
        users = temporaryUsers;


        do {
            System.out.println("Enter your phone number");
            phoneNumber = scanner.nextLine();
        } while (checkPhoneNumber(phoneNumber));

        do {
            System.out.println("Enter your password");
            password = scanner.nextLine();
        } while (strongPassword(password));

        String answer;
        do {
            System.out.println("Are you an agent? (Y/N) ");
            answer = scanner.nextLine();

        } while (answer == "Y" || answer == "N" || answer == "y" || answer == "n");

        if (answer == "Y" || answer == "y ") {

            agentOrRegular = true;
        } else {
            agentOrRegular = false;
        }
        users[users.length - 1] = new User(newUser, password, phoneNumber, agentOrRegular);

    }

    public String UserLogin(String userName, String password, User [] users, String[] arrayPassword) {
        boolean checkUser = false;
        boolean checkPassword = false;
        int indexUser = 0;
        int indexPassword=0;
        String match;
        for (int i = 0; i < users.length; i++) {
            if (userName == this.username) {
                checkUser = true;
                indexUser=i;
            }
            if (password == this.password) {
                checkPassword = true;
                indexPassword =i;
            }

        }
        if(indexUser!=indexPassword){
            checkPassword=false;
            checkUser=false;
        }
        if (checkUser && checkPassword) {
            match = "succeed";
        } else {
            match = null;
        }
        return match;
    }


}

