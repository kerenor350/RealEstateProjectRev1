import java.util.Scanner;

public class User {
    private String username;
    private String password;
    private String phoneNumber;
    private boolean agentOrRegular;

    public User(String userName, String password, String phoneNumber, boolean agentOrRegular) {
        this.username = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.agentOrRegular = agentOrRegular;
    }



        public User(){
        }

    public String getUsername() {
        return username;

    }

    public boolean isUserName ( String userName ){
        boolean check = false;
        if ( this.username == userName){
           check = true;
        } return check;
    }




    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

//    public boolean getAgentOrRegular() {return agentOrRegular;}

    //public void setAgentOrRegular(String agentOrRegular) {this.agentOrRegular = agentOrRegular;
    }


}